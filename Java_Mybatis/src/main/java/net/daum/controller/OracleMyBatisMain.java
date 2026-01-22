package net.daum.controller;

import java.util.List;
import java.util.Scanner;

import net.daum.dto.DeptDTO;
import net.daum.service.OracleMyBatisService;
public class OracleMyBatisMain {

    /*  서비스 흐름은 컨트롤러 ↔ 서비스 ↔ DAO ↔ MyBatis 매퍼태그 해당 아이디를 호출해서 쿼리문 수행
     *  실제 코드 작업은 서비스 흐름의 반대로 하는 것이 좋다.
     *  
     *  패키지 정리)
     *   net.daum.controller -> 자바 애플리케이션 프로그램 개발에서 최초 시작지점인 main() 정적메서드가 포함된 클래스가 있는 곳
     *   net.daum.service -> 컨트롤러와 DAO사이 중간 매개체 역할을 하는 *Service 클래스가 들어가는 곳
     *   net.daum.dao ->  DAO (Data Access Object) 실제로 데이터베이스(DB)에 접근하여 CRUD(Create(데이터 저장) -> insert 쿼리문 ,
     *    Read(데이터 조회) -> select 쿼리문 , Update, Delete) 작업을 수행하는 곳 
     *   net.daum.mappers.mybatis -> sql문을 담고 있는 mybatis 매퍼태그 파일인 Mapper.xml 파일이 위치한 곳, 트랜잭션 설정과 커넥션 풀 
     *   그리고 데이터베이스 연결 정보와 SQL문을 담고 있는 MyBatis 매퍼태그 파일 경로가 설정된  Configuration.xml 파일이 들어간 경로
     *   net.daum.dto -> 람복 라이브러리를 사용한 데이터 저장빈 클래스가 들어간 곳
     *   net.daum.config -> Configuration.xml 파일을 읽어와 mybatis 쿼리문 실행 객체 SqlSession을 반환하는 정적메서드인 getSqlSession()
     *   가 있는 MyBatisSessionFactory 클래스 파일이 있는 곳
     */

    private Scanner scan = new Scanner(System.in);
    OracleMyBatisService servie = new OracleMyBatisService();

    //부서목록을 가져오는 메서드 정의
    public void list() {
        System.out.println(); //줄바꿈
        System.out.println("[부서 목록");
        System.out.println("--------------------------------------------");
        System.out.printf("%-6s%-12s%-16s\n", "부서번호", "부서명", "부서지역");
        /*
        %-6s에서 %s는 문자열 출력 형태지시자이다. -는 왼쪽 정렬, 6은 최소 출력 너비 6칸, 결국 %-6s는 
        문자열을 왼쪽정렬하고, 전체 너비를 6칸으로 맞추라는 의미이다. 빈칸이 남으면 오른쪽에 공백이 들어간다.
        */
        System.out.println("--------------------------------------------");

        List < DeptDTO > dlist = this.servie.selectAll(); //부서목록을 가져온다. this.은 생략가능
        if (dlist != null && dlist.size() > 0) { //size()메서드는 컬렉션 원소개수를 반환한다. 첫 원소 개수를 1부터 카운터한다.
            for (DeptDTO d: dlist) {
                System.out.printf("%-6d%-12s%-16s\n", d.getDeptno(), d.getDname(), d.getLoc());
            } //자바 5버전에서 추가된 향상된 확장 for
        } else {
            System.out.println("부서목록이 없습니다.");
        } //if ~ else
    } //list
    public static void main(String[] args) {

        OracleMyBatisMain oracleMyBatis = new OracleMyBatisMain();
        oracleMyBatis.list(); //부서 목록을 가져오는 메서드를 호출

    }
}

