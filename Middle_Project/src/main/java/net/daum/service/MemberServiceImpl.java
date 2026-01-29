package net.daum.service;

import net.daum.dao.MemberDAOImpl;

public class MemberServiceImpl implements MemberService{
    /*  컨트롤러와 DAO사이에 service를 넣는 이유는
   데이터베이스 작업(여러 DAO 메서드 호출 등)에 트랜잭션(rollback, commit) 을 걸고 싶을 때 주로 Service 계층에서 처리하기 때문이다.
   Service 계층이 없으면 Controller이 직접 DB 처리 로직을 호출해야 하므로 코드가 복잡하고 유지보수가 어렵다.
   Controller 요청 처리, DAO는 DB 처리, Service는 비즈니스 로직 처리 하고 유지보수성 향상,로직이 분리되어 변경 및 디버깅이 쉬움,테스트 용이
   고객의 추가 요구 사항 반영(애프터 서비스라고 생각하면 쉽다.)
          컨트롤러와 DAO사이 중간 매개체 역할
    * 
    */


}
