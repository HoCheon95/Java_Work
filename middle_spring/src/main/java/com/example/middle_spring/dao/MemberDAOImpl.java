package com.example.middle_spring.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.middle_spring.dto.MemberDTO;
import com.example.middle_spring.dto.ZipcodeDTO;
import com.example.middle_spring.mybatis.config.DBService;

public class MemberDAOImpl implements MemberDAO{
    /*
    * DAO (Data Access Object) 실제로 데이터베이스(DB)에 접근하여 CRUD(Create(데이터 저장) -> insert 쿼리문 ,
    *    Read(데이터 조회) -> select 쿼리문 , Update, Delete) 작업을 수행하는 곳 
    */

   /*  SqlSession은 DB에 SQL문을 실행하기 위해 필요한 모든 메소드를 가지고 있다.
    *  SqlSession은 JDBC에서 개발자가 직접 Connection을 생성하고 PreparedStatement를
    *   이용해서 SQL을 실행하던 모든 작업을 내부적으로 자동으로 처리해 준다. 
    */

   /*
    *   mybatis 쿼리문 실행메서드 정리)
    *     1. selectOne() : 하나의 결과 레코드만 조회할 때 사용
    *     2. selectList() : 하나 이상의 레코드를 검색해서  컬렉션 List<제네릭타입>으로 반환
    *     3. insert() : 레코드 저장, 반환값은 저장 쿼리문 수행후 성공한 레코드 행(row)의 수 반환
    *     4. update() : 레코드 수정, 반환값은 수정 쿼리문 수행후 성공한 레코드 행의 수를 반환
    *     5. delete() : 레코드 삭제, 반환값은 삭제 쿼리문 수행후 성공한 레코드 행의 수를 반환     
    */

   //정적변수
   private static MemberDAOImpl instance = null;

   //기본생성자
   public MemberDAOImpl(){}

   //DAOImpl 객체 생성해서 반환
   public static MemberDAOImpl getInstance(){
    if(instance == null){
        instance = new MemberDAOImpl();
    }
    return instance;
   }//getInstance()

   //mybatis 쿼리문 수행 sqlSession 반환
   private SqlSession getSqlSession(){
    return DBService.getFactory().openSession(false);//false -> 수동 commit모드
    //한줄에 메서드를 연이어서 사용한 메서드 체이닝 방법이다. 이 방법을 사용하면 코드라인을 줄일 수 있다.
    //DBService.getFactory()를 호출하면 mybatis 쿼리문을 수행할 수 있는 sqlSession 인스턴스 를 생성하게 해주는
    //SqlSessionFactory를 반환한다.
   }//getSqlSession()

   @Override
   public MemberDTO idCheck(String id){
    SqlSession sqlSession = null;

    try{
        sqlSession = getSqlSession();//mybatis쿼리문 수행할 sqlSession 생성
        return sqlSession.selectOne("m_idcheck", id);
        //m_dicheck는 mybatis member.xml 매퍼태그에서 설정하는 유일 아이디명이다.
    }finally{
        if(sqlSession != null) sqlSession.close();
    }

   }//idCheck() -> 아이디 중복 검색

   @Override
    public List<ZipcodeDTO> zipFind(String dong){
     SqlSession sqlSession = null;
    
     try{
          sqlSession = getSqlSession();//mybatis쿼리문 수행할 sqlSession 생성
          return sqlSession.selectList("m_zipfind", dong);
          //m_zipfind는 mybatis member.xml 매퍼태그에서 설정하는 유일 아이디명이다.
     }finally{
          if(sqlSession != null) sqlSession.close();
     }
    
    }//zipFind() -> 우편번호 검색   

}
