package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.daum.dto.BoardDTO;

public class BoardDaoImpl {

    String driver = "oracle.jdbc.driver.OracleDriver"; //oracle.jdbc.driver는 패키지명, OracleDriver는 오라클 jdbc 
    //드라이버클래스명
    String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; //오라클 접속 주소, 1521은 오라클 연결 네트워크 포트번호, xe는 데이터베이스명
    //127.0.0.1은 모든 내자신 컴퓨터 ip 주소
    String user = "week"; //오라클 접속 사용자
    String password = "week"; //사용자 비번

    PreparedStatement pstmt = null; //쿼리문을 수행할 pstmt
    String sql = null; //쿼리문 저장 변수

    public BoardDaoImpl() {

    } //기본 생성자

    //게시판 저장 메서드
    public int insertBoard(BoardDTO b) {
        int re = -1; //삭제 실패시 반환값

        try (
            Connection con = DriverManager.getConnection(url, user, password); // db연결con 생성
        ) {
            sql = "insert into tbl_board values(bno_seq.nextval,?,?,?,sysdate)"; //sysdate는 오라클 날짜함수
            pstmt = con.prepareStatement(sql); //쿼리문을 미리 컴파일하여 수행할 pstmt 생성
            pstmt.setString(1, b.getBname()); //쿼리문의 첫번째 물음표에 문자열로 글쓴이 저장
            pstmt.setString(2, b.getBtitle());
            pstmt.setString(3, b.getBcont());

            re = pstmt.executeUpdate(); //저장 쿼리문 수행후 성공한 레코드 행의 개수 반환
        } catch (Exception e) {
            e.printStackTrace();
        }
        return re;
    } //insertBoard()

    public List < BoardDTO > getBoardList() {
        List < BoardDTO > b_list = new ArrayList <> ();
        sql = "select * from tbl_board order by bno desc"; //글번호를 기준으로 내림차순 정렬

        try (
            Connection con = DriverManager.getConnection(url, user, password); // db연결con 생성
            PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery(); //select문 수행후 결과 고객번호 레코드를 rs에 저장 -> 큰 숫자번호가 먼저 정렬
        ) {
            while (rs.next()) { //복수개의 레코드가 검색될 때는 while반복문으로 처리
                BoardDTO b = new BoardDTO();

                b.setBno(rs.getInt("bno"));
                //rs.getINt("bno")는 bno컬럼으로 부터 정수숫자로 번호값을 가져와서 setter()메서드에 저장
                b.setBtitle(rs.getString("btitle"));
                //rs.getString("btitle")은 btitle컬럼으로 부터 문자열로 글제목을 가져와서 setter() 메서드에 저장
                b.setBname(rs.getString("bname"));
                b.setBcont(rs.getString("bcont"));
                b.setBdate(rs.getString("bdate"));

                b_list.add(b); //컬렉션에 추가
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return b_list;
    }

    //DB로 부터 게시판 번호검색
    public BoardDTO getFindBno(int bno) {
        BoardDTO b = null;

        sql = "select * from tbl_board where bno=?";

        try (
            Connection con = DriverManager.getConnection(url, user, password); // db연결con 생성
            PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, bno);
            try (ResultSet rs = pstmt.executeQuery();) { //select문 수행후 결과 고객번호 레코드를 rs에 저장
                if (rs.next()) { //검색 레코드가 하나이면 if 조건문으로 처리
                    b = new BoardDTO();
                    b.setBno(rs.getInt("bno"));
                    b.setBname(rs.getString("bname"));
                    b.setBtitle(rs.getString("btitle"));
                    b.setBcont(rs.getString("bcont"));
                    b.setBdate(rs.getString("bdate"));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return b;
    }

    //게시판 수정 -> 번호를 기준으로 글쓴이, 글제목, 글내용 수정처리
    public int updateBoard(BoardDTO eb) {

        int re = -1;

        sql = "update tbl_board set bname=?, btitle=?, bcont=? where bno=?";

        try (
            Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, eb.getBname());
            pstmt.setString(2, eb.getBtitle());
            pstmt.setString(3, eb.getBcont());
            pstmt.setInt(4, eb.getBno());

            re = pstmt.executeUpdate(); //수정 쿼리문 수행 후 성공한 레코드 행의 개수 반환

            if (re == 1) {
                System.out.println("게시판 수정에 성공했습니다.");
            } else {
                System.out.println("검색된 게시판번호가 존재하지 않아서 수정 못합니다.!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void delBoard(int bno) {
        int re = -1;

        sql = "delete from tbl_board where b_no=?"; //번호를 기준으로 삭제
        try (
            Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setInt(1, bno);
            re = pstmt.executeUpdate(); //삭제 쿼리문 수행후 성공한 레코드 행의 개수 반환

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
