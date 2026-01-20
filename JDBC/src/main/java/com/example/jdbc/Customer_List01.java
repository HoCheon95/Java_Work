package com.example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
/* 고객목록 보기)
 * JDBC 쿼리문 수행하는 Statement API를 사용한다. select 문 수행
   JDBC api는 java.sql.* 패키지에서 제공한다. *는 모든 API를 뜻한다.

    1. Class.forName(driver) -> JDBC드라이버 로드
      오라클 JDBC 드라이버 패키지 종류:
       oracle.jdbc.driver.OracleDriver -> 구식(옛날것),Oracle 공식 문서에서도 더 이상 권장되지 않음.

       oracle.jdbc.OracleDriver -> 신식 ,  Oracle이 공식적으로 제공하고 문서화한 JDBC 드라이버 클래스.
       
      최신 Oracle JDBC 드라이버에서는 이 클래스를 사용하도록 권장함.

   2. Connection con = DriverManager.getConnection(url, user, password); -> db접속주소,사용자,비번으로 DB연결 Connection 생성
   
   3. Statement stmt=con.createStatement(); -> 쿼리문을 수행할 stmt생성. 이 벙법은 쿼리문의 수행속도가 느리고 요즘은 잘 사용 안한다.
    보안면에서 불리하고 가독성이 좋지 않아 유지 보수면에서 불리하다.

   4. ResultSet rs=stmt.executeQuery("쿼리문"); -> select 검색 쿼리문 수행후 검색 결과를 ResultSet rs에 저장, 
   select문일때는 executeQuery()메서드를 사용해서  해당 sql문 수행

   5. 검색 결과 레코드가 복수개 일때는 while(rs.next()){}를 사용하고 한개일때는 if(rs.next()){}를 사용한다.

   6. if문과 while반복문에서 테이블 컬럼(필드)레코드를 가져올 때 해당 컬럼 타입에 따라 다음과 같이 가져온다. 

   해당 컬럼명이 cus_name이고 컬럼타입이 varchar2라면
      rs.get컬럼타입("컬럼명") 즉 rs.getString("cus_name")이다.

      rs.getString("필드명")으로 가져오면 속도는 약간 떨어지지만 가독성이 좋다.

      또는 rs.getInt(select문 뒤에 검색되는 컬럼순번) 대로 가져오면 속도는 조금 빠르지만 가독성이 나쁘다. 속도차는 거의 못느끼는 수준이디. 
      그러므로 유지 보수 차원에서 가독성이 더 좋은 방법 rs.getString("필드명") 방법으로 해당 테이블 컬럼(필드)
      레코드(컬럼에 저장된 한행의 자료집합)를 가져오는 것이 일반적이다.
 */

public class Customer_List01 {
    public static void main(String[] args) {

        // oracle.jdbc.driver는 패키지명
        // OracleDriver는 오라클 jdbc 드라이버 클래스명
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        // 오라클 접속주소, 127.0.0.1은 모든 내자신 컴퓨터의 ip주소, 1521은 오라클 연결 네트워크 포트번호, xe는 데이터베이스명
        String user = "week";// 오라클 사용자명
        String pwd = "week";// 사용자 비번

        String sql = "select * from customer order by cus_no desc";// 쿼리문 저장변수sql = "select * from customer order by
                                                                   // cus_no desc";
        try (
                Connection con = DriverManager.getConnection(url, user, pwd); // 메서드 인자값으로 db접속주소, 사용자, 비번을 전달해서 db연결con
                                                                              // 생성
                Statement stmt = con.createStatement(); // 고객번호를 기준으로 내림차순 정렬 -> jdbc자바 코드에서 sql문은 큰따옴표 "쿼리문" 문자열로 처리한다.
                ResultSet rs = stmt.executeQuery(sql); // select 검색쿼리문을 실행할 떄는 executeQuery()메서드를 사용한다. 검색결과 레코드를 rs에 저장
        ) {

            System.out.println(">>>>>>>>> 고객 목록 <<<<<<<<<<");
            System.out.println("고개번호 \t 고객이름 \t 고객폰번호 \t 고객이메일 \t 고객등록날짜");
            System.out.println("==============================================");

            while (rs.next()) {
                // 복수개의 레코드가 검색될 때는 while반복문으로 처리하고 한개의 레코드가 검색될 떄는 if조건문으로 처리한다.
                // next()메서드는 검색된 다음 레코드가 존재하면 참
                int cus_no = rs.getInt("cus_no");// 1의 뜻은 select문뒤에 검색되는 컬럼순번이다.
                // getInt()메서드는 컬럼에 저장된 레코드값이 정수 숫자일때 해당 값을 가져온다.
                System.out.println(cus_no + "\t" + rs.getString("cus_name") + "\t" + rs.getString("cus_phone") + "\t"
                        + rs.getString("cus_email") +
                        "\t" + rs.getString("cus_date"));
                // getString("cus_name")은 cus_name 컬럼에 저장된 레코드값이 문자열이면 getString()메서드로 가져온다.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
