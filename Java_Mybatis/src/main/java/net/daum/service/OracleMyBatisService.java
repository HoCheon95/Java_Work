package net.daum.service;

import net.daum.dao.OracleMyBatisDAO;

public class OracleMyBatisService {

    /*
    컨트롤러와 DAO사이에 service를 넣는 이유는
    데이터베이스 작업(여러 DAO 메서드 호출 등)에 트랜잭션(rollback, commit) 을 걸고 싶을 때 주로 Service 계층에서 처리하기 때문이다.
    Service 계층이 없으면 Controller이 직접 DB 처리 로직을 호출해야 하므로 코드가 복잡하고 유지보수가 어렵다.
    Controller 요청 처리, DAO는 DB 처리, Service는 비즈니스 로직 처리 하고 유지보수성 향상,로직이 분리되어 변경 및 디버깅이 쉬움,테스트 용이
    고객의 추가 요구 사항 반영(애프터 서비스라고 생각하면 쉽다.)
    */

    OracleMyBatisDAO dao;

    public OracleMyBatisService() {
        //super();//최고 조상 부모클래스 Object의 기본생성자를 호출
        dao = new OracleMyBatisDAO();
    } //기본생성자 정의 -> new OracleMyBatisService();에 의해서 기본생성자를 호출하면서 dao 객체 생성
}
