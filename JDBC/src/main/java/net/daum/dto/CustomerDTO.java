package net.daum.dto;

import lombok.Getter;
import lombok.Setter;

/*
패키지 경로 정리)
net.daum.controller -> 자바 어플리케이션 프로그램에서 가장 먼저 시작하는 정적메서드인 public static void main(String[] args){ }
 이 포함된 클래스가 있는 곳

net.daum.dto -> 값 저장 메서드인 setter(), 값 반환 메서드인 getter() 가 포함된 중간 데이터 저장빈 클래스 DTO가 있는 패키지
람복 라이브러리로 setter(), getter()메서드는 생략한다.

DTO(Data Transfer Object)
 ✅ 의미:
 데이터 전송 객체로, 계층 간(예: 컨트롤러 ↔ 서비스 ↔ DAO) 데이터를 전달할 때 사용하는 객체.
 순수하게 데이터만 담는 객체.
 
 DTO 빈클래스 멤버변수 이름은 테이블 컬럼명과 같게 한다. 이유는? 
테이블 컬럼명과 DTO의 변수명이 같으면, DB ↔ Java 간 데이터 매핑이 직관적이고 예측 가능해져서 유지 보수 용이하고 빈클래스 변수명을 무엇으로 할까 고민을 덜하게 해준다.
mybatis 프레임웍 등에서 빈클래스 변수명과 컬럼명이 일치하면 일대일 매핑이 되어서 테이블 컬럼 레코드값을 자동으로 가져올수 있게 된다.그만큼 코드라인이 줄어든다.

매핑(mapping)은 서로 다른 구조나 표현 방식을 가진 두 요소를 서로 연결하거나 대응시키는 작업을 의미 => 일대일, 일대다, 다대일, 다대다 대응

컨트롤러와 DAO사이에 service를 넣는 이유는
데이터베이스 작업(여러 DAO 메서드 호출 등)에 트랜잭션(rollback, commit) 을 걸고 싶을 때 주로 Service 계층에서 처리하기 때문이다.
Service 계층이 없으면 Controller이 직접 DB 처리 로직을 호출해야 하므로 코드가 복잡하고 유지보수가 어렵다.
Controller 요청 처리, DAO는 DB 처리, Service는 비즈니스 로직 처리 하고 유지보수성 향상,로직이 분리되어 변경 및 디버깅이 쉬움,테스트 용이
고객의 추가 요구 사항 반영(애프터 서비스라고 생각하면 쉽다.)

net.daum.dao -> DAO (Data Access Object)
 ✅ 의미:
 실제로 데이터베이스(DB)에 접근하여 CRUD(Create(데이터 저장) -> insert 쿼리문 , Read(데이터 조회) -> select 쿼리문 , Update, Delete) 
 작업을 수행하는 객체.DB 연결, DB 작업 수행, SQL 처리
*/

@Setter //람복 라이브러리에 의해서 setter() 메서드 자동생성
@Getter //getter()메서드 자동생성
public class CustomerDTO {
    /*
    중간 데이터 저장빈 클래스 DTO -> customer 테이블의 컬럼명과 빈클래스 멤버변수명(인스턴스 변수명 -> 속성명)은 같게 한다.
    이유는 mybatis SQL 프레임웍을 다룰떄 코드 라인을 줄이는 방법이다.
     */

    private int cus_no; //고객번호
    private String cus_name; //고객이름
    private String cus_phone; //고객폰번호
    private String cus_email; //고객이메일
    private String cus_date; //고객 등록날짜

}
