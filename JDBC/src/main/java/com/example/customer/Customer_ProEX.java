package com.example.customer;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import net.daum.dao.CustomerDAOImpl;
import net.daum.dto.CustomerDTO;

/* 스캐너로 고객번호를 입력받아서 오라클로부터 검색을 한 다음 있는 경우는 저장프로시저를 실행하게 하고 없어면 유효성 검증 메시지를 
 * 띄운다. 

 고객번호가 있는 경우)
 JDBC api는 java.sql.* 패키지에서 제공한다. *는 모든 API를 뜻한다.
  CallableStatement api는 저장프로시저를 수행한다.

   1. Class.forName(driver) -> JDBC드라이버 로드
   2. Connection con = DriverManager.getConnection(url, user, password); -> db접속주소,사용자,비번으로 DB연결 Connection 생성
   3. String sql = "{call customer_pro(?,?,?,?)}"; ->customer_pro() 저장 프로시저문 호출문
   3. CallableStatement ct = con.prepareCall(sql); -> 저장프로시저를 호출해서 수행할 ct생성
   4. ct.setInt(4, cus_no); -> 4는 물음표 순번이다. 4번째 물음표에 정수 숫자로 고객번호를 저장
   5. ct.registerOutParameter(1, java.sql.Types.VARCHAR);
     ct: CallableStatement 객체이다. Connection.prepareCall()을 사용해 생성된 객체로, 저장 프로시저 호출에 사용한다.
     registerOutParameter: 저장 프로시저의 OUT 파라미터의 데이터 타입을 등록한다.
     1: 첫 번째 물음표(?)에 해당하는 파라미터 위치를 지정한다. JDBC에서는 파라미터 인덱스가 1부터 시작한다.
     java.sql.Types.VARCHAR: 해당 OUT 파라미터가 문자열 타입임을 나타낸다. Oracle에서는 VARCHAR2, CHAR 등에 대응한다.

    즉, Oracle 저장프로시저에서 반환받을 첫 번째 OUT 파라미터의 타입이 문자열(VARCHAR) 이므로, 그것을 JDBC에게 알려주는 단계
    6. ct.execute(); -> 저장 프로시저 실행 
   7. System.out.println(cus_no+"\t"+ct.getString(1)+"\t"+ct.getString(2)+"\t"+ct.getString(3));  ->
   검색된 레코드 값을 물음표 순번대로 가져와서 값을 출력
 */

public class Customer_ProEX {
    public static void main(String[] args) {

        String driver = "oracle.jdbc.OracleDriver";

        String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클 접속주소, 1521은 오라클 연결 네트워크 포트번호, xe는 데이터베이스명
        String user = "week"; //오라클 사용자
        String password = "week"; //사용자 비번

        String sql = "";



        try (
            Connection con = DriverManager.getConnection(url, user, password);
        ) {
            CallableStatement ct = null;
            Scanner scan = new Scanner(System.in);
            CustomerDAOImpl cdao = new CustomerDAOImpl();
            System.out.println("###### 오라클 저장프로시저 호출 실행 ######");
            System.out.print("기준이 되는 고객번호 입력:");
            int cus_no = Integer.parseInt(scan.nextLine()); //문자열로 입력받아서 정수숫자로 변경해서 저장
            CustomerDTO db_CusNo = cdao.getFindCusNo(cus_no); //오라클로 부터 고객번호 검색

            if (db_CusNo == null) {
                System.out.println("고객번호가 없어서 저장프로시저를 호출 실행할 수 없다.");
            } else {
                sql = "{call customer_pro(?,?,?,?)}";
                ct = con.prepareCall(sql); //저장프로시저를 호출해서 수행할 ct생성
                ct.setInt(4, cus_no); //네번째 물음표에 정수 숫자로 교객번호 저장
                ct.registerOutParameter(1, java.sql.Types.VARCHAR); //오라클 저장프로시저에서
                //반환 받을 첫번째 OUT 파라미터 타입이 문자열 VARCHAR 이므로, 이것을 JDBC에 알려주는 단계
                ct.registerOutParameter(2, java.sql.Types.VARCHAR);
                ct.registerOutParameter(3, java.sql.Types.VARCHAR);

                ct.execute(); //저장 프로시저 실행

                System.out.println("고객번호 \t 고객이름 \t 고객폰번호 \t 고객이메일");
                System.out.println("----------------------------------------------");
                System.out.printf("%d\t%s\t%s\t%s", cus_no, ct.getString(1), ct.getString(2), ct.getString(3));
            } //if ~ else

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
