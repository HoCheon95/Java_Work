package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/* 
    Statement JDBC 쿼리문 수행하는 api를 사용해서 고객 정보를 저장되게 하는 코드를 작성한다. 
   insert,update,delete SQL문일때는 executeUpdate()메서드로 해당 쿼리문을 수행하고 반환값은 해당 쿼리문 수행후 
   성공한 레코드 행의 개수가 반환

   1. Class.forName(driver) -> JDBC드라이버 로드
   2. Connection con = DriverManager.getConnection(url, user, password); -> db접속주소,사용자,비번으로 DB연결 Connection 생성
   3. Statement stmt=con.createStatement(); -> 쿼리문을 수행할 stmt생성. 이 벙법은 쿼리문의 수행속도가 느리고 요즘은 잘 사용 안한다.
    보안면에서 불리하고 가독성이 좋지 않아 유지 보수면에서 불리하다.
   4. 쿼리문에 직접 저장할 레코드값을 할당한다.
   5. int re=stmt.executeUpdate(sql); 매서드로 해당 저장 쿼리문을 수행한다. 저장 쿼리문 수행후 성공한 레코드 행의 개수 주로 정수값 1
   을 반환

 */
public class Customer_Insert01 {
    public static void main(String[] args) {

        // oracle.jdbc.driver는 패키지명
        // OracleDriver는 오라클 jdbc 드라이버 클래스명
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        // 오라클 접속주소, 127.0.0.1은 모든 내자신 컴퓨터의 ip주소, 1521은 오라클 연결 네트워크 포트번호, xe는 데이터베이스명
        String user = "week"; // 오라클 사용자명
        String pwd = "week"; // 사용자 비번
        String sql = null;

        try (

            Connection con = DriverManager.getConnection(url, user, pwd); // db연결con 생성
            Statement stmt = con.createStatement(); // 고객번호를 기준으로 내림차순 정렬 -> jdbc자바 코드에서 sql문은 큰따옴표 "쿼리문" 문자열로 처리한다.

        ) {

            Scanner scan = new Scanner(System.in);
            System.out.println("######### customer 테이블에 레코드 저장실습 ############");
            System.out.print("고객이름 입력:");
            String name = scan.nextLine(); // 문자열로 읽어들임
            System.out.print("고객 폰번호 입력:");
            String phone = scan.nextLine();
            System.out.print("고객 이메일 입력:");
            String email = scan.nextLine();

            sql = "insert into customer (cus_no, cus_name, cus_phone, cus_email) values(" + "cus_seq.nextval,'" + name +
                "','" + phone + "','" + email + "')";

            int re = stmt.executeUpdate(sql);
            // insert, update, delete 쿼리문을 실행할 때는 executeUpdate() 메서드를 사용한다.
            // 저장쿼리문 수행 후 성공한 레코드 행의 개수를 반환. 보통 1을 반환한다.

            if (re == 1) {
                System.out.println("고객정보 저장성공~");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
