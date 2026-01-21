package com.example.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/* PreparedStatement JDBC 쿼리문 수행하는 api를 사용해서 고객 정보를 수정되게 하는 코드를 작성한다. 
   insert,update,delete SQL문일때는 executeUpdate()메서드로 해당 쿼리문을 수행하고 반환값은 해당 쿼리문 수행후 성공한 레코드 
   행의 개수가 반환

   1. Class.forName(driver) -> JDBC드라이버 클래스 로드
   2. Connection con = DriverManager.getConnection(url, user, password); -> db접속주소,사용자,비번으로 DB연결 Connection 생성
   3. PreparedStatement pt=con.prepareStatement(sql); -> 쿼리문을 미리 컴파일해서 수행할 pt생성(보안이 좋고 실행속도가 빠르다. 실무에서
    대부분 이 방법을 사용한다.)
   4. pt.set컬럼타입(1,저장될 값); 으로 해당 update 테이블명 set 컬럼명=?, 컬럼명(필드명)=? ...
   where 기준컬럼명=?;  SQL문에서 수정저장될 임의의 모르는 값 ? 순번인 첫번째 물음표에 해당 컬럼타입으로 저장할 값을 저장한다.
   5. 쿼리문 ?순번대로 모든 값을 저장한 다음 int re=pt.executeUpdate(); 매서드로 해당 수정 쿼리문을 수행한다. 
   수정 쿼리문 수행후 성공한 레코드 행의 개수 주로 정수값 1을 반환
 */

/* 스캐너를 사용해서 고객번호를 입력받아 오라클 customer테이블로 부터 검색한 다음 해당 고객번호가 있다면 수정할 고객이름,고객 폰번호,고객 이메일을
 * 입력받아서 고객 번호를 기준으로 수정되게 하고 없다면 유효성 검증(Validate)  경고 메시지를 띄우는 고객정보수정 소스) 
 */

public class Customer_Edit01 {
    public static void main(String[] args) {

        // oracle.jdbc.driver는 패키지명
        // OracleDriver는 오라클 jdbc 드라이버 클래스명
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        // 오라클 접속주소, 127.0.0.1은 모든 내자신 컴퓨터의 ip주소, 1521은 오라클 연결 네트워크 포트번호, xe는 데이터베이스명
        String user = "week"; // 오라클 사용자명
        String pwd = "week"; // 사용자 비번

        PreparedStatement pt = null;
        String sql = null;
        ResultSet rs = null;

        try (
            Connection con = DriverManager.getConnection(url, user, pwd); // db연결con 생성
        ) {

            Scanner scan = new Scanner(System.in);
            System.out.println("########## 고객정보 수정 #############");
            System.out.print("기준이 되는 고개번호 입력 : ");
            int cus_no = Integer.parseInt(scan.nextLine()); //스캐너로 고객번호를 문자열로 입력받아서 정수숫자로 변경해서 저장
            sql = "select cus_no from customer where cus_no =?"; //고객번호를 기준으로 오라클 DB customer테이블로 부터 고객번호를 검색
            pt = con.prepareStatement(sql); //쿼리문을 미리 컴파일하여 수행할 pt 생성
            pt.setInt(1, cus_no); //쿼리문의 첫번째 물음표에 기준이 될 고객번호르 정수숫자로 저장
            rs = pt.executeQuery(); //검색 쿼리문 수행후 결과 레코드를 rs에 저장

            if (rs.next()) { //검색된 고객번호가 하나일 떄는 if조건문으로 처리 -> next()메서드는 검색된 다음 레코드가 존재하면 true
                System.out.print("수정할 고객이름 입력:");
                String name = scan.nextLine();
                System.out.print("수정할 고객폰번호 입력:");
                String phone = scan.nextLine();
                System.out.print("수정할 고객이메일 입력:");
                String email = scan.nextLine();

                sql = "update customer set cus_name=?, cus_phone=?, cus_email=?" + "where cus_no=?";
                //고객 번호를 기준으로 고객이름, 고객 폰번호, 고객 이메일을 수정한다.

                pt = con.prepareStatement(sql); //수정 쿼리문을 미리 컴파일하여 수행할 pt생성
                pt.setString(1, name); //쿼리문의 첫번쨰 물음표에 문자열로 수정할 고객이름 저장
                pt.setString(2, phone);
                pt.setString(3, email);
                pt.setInt(4, cus_no); //쿼리문의 네번쨰 물음표에 정수숫자로 기준이 될 고객번호 저장

                int re = pt.executeUpdate(); //수정 퀴리문 수행 후 성공한 레코드 행의 개수 반환
                if (re == 1)
                    System.out.println("고객정보 수정에 성공했습니다.!");
            } else {
                System.out.println("검색된 고객번호가 존재하지 않아서 수정 못합니다.!");
            } //if ~else


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pt != null) pt.close();
            } catch (Exception e) {}
        }

    }
}
