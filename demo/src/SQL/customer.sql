--오라클 한줄 주석문 기호

/*
    오라클 여러줄 주석문 기호
*/

CREATE TABLE customer( -- customer 테이블 생성
    cus_no number(38) PRIMARY KEY -- 고객번호, cus_no는 컬럼명 즉 필드명이라고 한다. 이 컬럼명에 최종 
    --자료(레코드->컬럼에 저장된 한행의 자료집합)가 저장된다.ANNOTATIONS
    , cus_name VARCHAR2(50) NOT NULL -- 고객이름
    , cus_phone VARCHAR2(30) NOT NULL -- 고객 폰번호
    , cus_email VARCHAR2(100) NOT NULL -- 고객 전자우편
    , cus_date DATE DEFAULT SYSDATE -- 고객 등록날짜, default sysdate 제약조건을 주명 해당 컬럼에
    -- 굳이 레코드 날짜를 저장하지 않아도 기본 날짜값이 저장된다.
);

/*
    오라클 자료형 종류)
     1. number(38) : 최대자리수가 38자까지 정수 숫자값을 저장되게 하는 정수 숫자 타입이다.
     2. varchar2 : 가변문자 자료형 
     3. date : 날짜 자료형

     제약조건이란 테이블 컬럼에 레코드 저장시 어떤 제한을 가하는 것을 말한다.

     제약조건 종류)
      1. primary key(기본키 제약조건) : 중복 레코드 자정금지, null 저장금지
      2. not null 제약조건 : null 저장금지, 중복 레코드는 저장가능하다.

      sysdate는 오라클 날짜함수
*/

--오늘 날짜 시간값 확인
SELECT sysdate as "오늘날짜시간값" from dual;

--생성된 customer 테이블 컬럼명과 레코드 확인
select * from customer; --customer 테이블의 모든 컬럼(*) 레코드 데이터를 검색하는 sql문이다.

/*
    레코드 저장문 insert 문 문법 형식)
     insert into 테이블명 (컬럼목록) values(값);
     
*/