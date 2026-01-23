package net.daum.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import net.daum.config.MyBatisSessionFactory;
import net.daum.dao.OracleMyBatisDAO;
import net.daum.dto.DeptDTO;

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

    public List < DeptDTO > selectAll() {
        List < DeptDTO > dlist = null;

        //mybtis 쿼리문을 수행하는 sqlSession 생성
        try (SqlSession sqlSession = MyBatisSessionFactory.getSqlSession().openSession();) {
            dlist = this.dao.selectAll(sqlSession);
            //Dao쪽 메서드 호출할 떄 mybatis 쿼리문을 수행하는 sqlSession을 인자값으로 전달하는 것에 대해서 주의 요망
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dlist;
    } //selectAll()

    //부서정보 추가
    public void insertDept(DeptDTO deptDTO) {
        try (SqlSession sqlSession = MyBatisSessionFactory.getSqlSession().openSession()) {
            this.dao.insertDept(deptDTO, sqlSession);
            sqlSession.commit();
            /*
                MyBatis SqlSession 인 경우 auto commit 이 비활성화 되어 있기 때문에 반드시
                DML(insert,update,delete) 문 수행후 commit() 메서드를 명시적으로 실행해야 한다.
                그래야만 insert 저장쿼리문이 성공적으로 반영된다. 그렇지 않으면 레코드가 저장되지 않는다.
            */

        } catch (Exception e) {
            e.printStackTrace();
        }
    } //insertDept()

    //부서정보를 기준으로 부서정보 검색
    public DeptDTO getFindDeptNo(int deptno) {
        DeptDTO dept = null;
        try(SqlSession sqlSession = MyBatisSessionFactory.getSqlSession().openSession()) {
            dept=this.dao.getFindDeptNo(deptno, sqlSession);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dept;
    }//getFindDeptNo()

    //부서정보를 기준으로 부서명과 부서지역 수정
    public void updateDept(DeptDTO dept) {
        try(SqlSession sqlSession = MyBatisSessionFactory.getSqlSession().openSession()) {
            this.dao.updateDept(dept,sqlSession);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//updateDept()

    //부서번호를 기준으로 부서정보 삭제
    public void deleteDept(DeptDTO dept) {
        try (SqlSession sqlSession = MyBatisSessionFactory.getSqlSession().openSession()){
            this.dao.deleteDept(dept, sqlSession);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//deleteDept

    //부서전체 삭제
    public void delAllDept() {
        try (SqlSession sqlSession = MyBatisSessionFactory.getSqlSession().openSession()){
            this.dao.delAllDept(sqlSession);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//delAllDept()

}
