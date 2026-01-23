package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.daum.dto.GuestBookDTO;

public class GuestBookDAOImpl {

    String driver = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver는 패키지명, OracleDriver는 오라클 jdbc 드라이버 클래스명
    String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // 오라클 접속 주소, 1521은 오라클 연결 네트워크 포트번호, xe는 데이터베이스명 127.0.0.1은 모든 내자신 컴퓨터 ip 주소
    String user = "week"; //오라클 접속 사용자
    String password = "week"; //사용자 비번
    String sql = null; //쿼리문 저장 변수

    public GuestBookDAOImpl() {} //기본 생성자

    //방명록 저장 메서드
    public int insertGuest(GuestBookDTO g) {
        int re = -1; // 저장 실패시 반환값

        sql = "insert into tbl_guestbook values(gno_seq.nextval,?,?,?,sysdate)";

        try (
            Connection con = DriverManager.getConnection(url, user, password); // db연결 con 생성
            PreparedStatement pstmt = con.prepareStatement(sql); // 쿼리문을 미리 컴파일하여 수행할 pstmt 생성
        ) {
            pstmt.setString(1, g.getGname()); // 쿼리문의 첫번째 물음표에 문자열로 글쓴이 저장
            pstmt.setString(2, g.getGtitle());
            pstmt.setString(3, g.getGcont());

            re = pstmt.executeUpdate(); // 저장 쿼리문 수행후 성공한 레코드 행의 개수 반환
        } catch (Exception e) {
            e.printStackTrace();
        }
        return re;
    }

    //방명록 조회 메서드
    public List < GuestBookDTO > getGuestBookList() {
        List < GuestBookDTO > g_list = new ArrayList <> (); // GuestBookDTO 객체들을 담을 수 있는 가변형 리스트(ArrayList) 생성

        sql = "select * from tbl_guestbook order by gno desc"; //방명록 번호를 기준으로 내림차순 정렬

        try (
            Connection con = DriverManager.getConnection(url, user, password); // db연결 con 생성
            PreparedStatement pstmt = con.prepareStatement(sql); // 쿼리문을 미리 컴파일하여 수행할 pstmt 생성
            ResultSet rs = pstmt.executeQuery(); // select문 수행후 결과 레코드를 rs에 저장 -> 큰 숫자가 먼저 정렬
        ) {
            while (rs.next()) { //복수개의 레코드가 검색될 때는 while반복문으로 처리
                GuestBookDTO g = new GuestBookDTO(); // DTO 객체 생성

                g.setGno(rs.getInt("gno"));
                //rs.getInt("gno")는 gno컬럼으로 부터 정수 숫자로 번호값을 가져와서 setter()메서드에 저장
                g.setGname(rs.getString("gname"));
                //rs.getString("gname")는 gname컬럼으로 부터 문자열로 작성자 이름을 가져와서 setter()메서드에 저장
                g.setGtitle(rs.getString("gtitle"));
                g.setGcont(rs.getString("gcont"));
                g.setGdate(rs.getString("gdate"));

                g_list.add(g); // 컬렉션 추가
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return g_list;
    }

    // DB로 부터 방명록 번호검색
    public GuestBookDTO getFindNo(int gno) {
        GuestBookDTO g = null;
        sql = "select * from tbl_guestbook where gno=?";

        try (
            Connection con = DriverManager.getConnection(url, user, password); // db연결 con 생성
            PreparedStatement pstmt = con.prepareStatement(sql); // 쿼리문을 미리 컴파일하여 수행할 pstmt 생성
        ) {
            pstmt.setInt(1, gno); //sql문에 gno=? ?위치 1번과, 값을 적음
            try (ResultSet rs = pstmt.executeQuery()) { // select문 수행후 결과 방명록 번호 레코드를 rs에 저장
                if (rs.next()) {//검색 레코드가 하나이면 if 조건문으로 처리
                    g = new GuestBookDTO(); //db에서 꺼낸 데이터들을 담을 객체 생성

                    g.setGno(rs.getInt("gno"));
                    g.setGname(rs.getString("gname"));
                    g.setGtitle(rs.getString("gtitle"));
                    g.setGcont(rs.getString("gcont"));
                    g.setGdate(rs.getString("gdate"));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return g;
    }

    // 게시판 수정 -> 번호를 기준으로 글쓴이, 글제목, 글내용 수정처리
    public int editGuestBook(GuestBookDTO gb) {
        int re = -1;

        sql = "update tbl_guestbook set gname=?, gtitle=?, gcont=? where gno=?";

        try(
            Connection con = DriverManager.getConnection(url, user, password);  // db연결 con 생성
            PreparedStatement pstmt = con.prepareStatement(sql);                // 쿼리문을 미리 컴파일하여 수행할 pstmt 생성
        ){
            pstmt.setString(1, gb.getGname());  //? 첫번째, gb의 name을 get으로 받아온다.
            pstmt.setString(2, gb.getGtitle());
            pstmt.setString(3,gb.getGcont());
            pstmt.setInt(4, gb.getGno());

            re = pstmt.executeUpdate(); //수정 쿼리문 수행 후 성공한 레코드 행의 개수 반환

            if(re == 1){
                System.out.println("방명록 수정에 성공했습니다.");
            }else{
                System.out.println("검색된 방명록이 존재하지 않아서 수정 못합니다.!");
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return re;
    }

    /* 방명록 삭제 */
    public int delGuest(int gno) {
        int re = -1;

        sql = "delete from tbl_guestbook where gno=?"; //삭제 쿼리

        try(
            Connection con = DriverManager.getConnection(url, user, password);  // db연결 con 생성
            PreparedStatement pstmt = con.prepareStatement(sql); //쿼리문을 미리 컴파일하여 수행할 pstmt 생성
        ){
            //쿼리문에 ? 값 대입
            pstmt.setInt(1, gno);
           re = pstmt.executeUpdate(); //삭제 쿼리문 수행후 성공한 레코드 행의 개수 반한

        }catch(Exception e){
            e.printStackTrace();
        }

        return re;
    }

}
