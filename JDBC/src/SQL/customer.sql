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
    테이블의 모든컬럼에 레코드 저장시에는 컬럼목록을 생략해도 된다. 이런 경우는 테이블 생성시 생성되는 컬럼순번대로
    값을 저장된다. 원하는 컬럼에만 레코드를 저장할 때는 컬럼목록을 명시해야 한다.
    컬럼목록 순서와 values(값) 순서가 일치해야 한다.
    문자열 값 레코드 저장시에는 ''(작은따옴표)로 감싼다.

    SQL 문은 대소문자를 구분하지 않는다. 하지만 컬럼에 저장된 영문 레코드는 대소문자를 구분한다.

    시퀀스란? 번호 발생기이다. 주로 고객번호나 게시판 번호 등 정수 숫자 번호값 발생용도로 사용한다. 
    시퀀스 특징)
        1. 시퀀스 번호는 중복 번호가 없고 NULL이 없는 기본키 제약조건인 primary key로 정의된 컬럼에 사용해야 한다.
           customer 테이블에서는 cus_no 컬럼에 사용해야 하고, 해당 컬럼은 정수숫자 타입인 number(38)로 정의된 컬럼에서 사용해야 한다.
        
        시퀀스 생성문법 형식)
            create sequence 시퀀스명
            start with 1 --1부터 시작, 기본값으로 생략가능
            increment by 1; --1씩 증가, 기본값으로 생략가능
            nochche --임시메모리를 사용하지 않겠다는 의미, 생략하면 기본값은 cache 20이다. 이것의 의미는 오라클에서 시퀀스 번호를 미리 20개까지
                      메모리에 올려 놓겠다는 의미이다. 어제 마지막으로 발급된 시퀀스 번호가 100이라면 캐시에서 101~120까지 메모리에 올려 놓고
                      있다가 다음 시퀀스 번호는 121부터 시작된다. 오늘 db가 재시작하면 캐시값은 초기화가 된다.
            nocycle; --시퀀스 최대값 또는 최소값에 도달하면 다시 처음부터 시퀀스 번호값을 반복하지 않겠다는 의미이다.
                     --기본값은 생략가능하다.        
*/

--cus_seq 시퀀스 생성
create sequence cus_seq
start with 1
increment BY 1
NOCACHE
NOCYCLE;

--생성된 cus_seq 시퀀스로 부터 다음번호값 확인
select cus_seq.nextval as "다음시퀀스번호값" from DUAL;

--customer 테이블에 2개의 레코드를 저장실습
insert into customer (cus_no, cus_name, cus_phone, cus_email) VALUES(cus_seq.nextval, '홍길동', '010-7777-7777', 'hong@naver.com');

insert into customer (cus_no, cus_name, cus_phone, cus_email) values(cus_seq.nextval, '이순신', '010-9999-9999', 'shin@naver.com');

/*
    레코드 검색쿼리문 문법형식)
        select 컬럼목록(전체컬럼은 *) from 테이블명 where 조건식 order by 기준컬럼 desc(asc);

        order by는 정렬문이다.
            1. desc는 내림차순 정렬이다.
            2. 내림차순 정렬 규칙)
                한글은 가나다 역순, 영어는 알파벳 역순, 숫자는 큰숫자부터 먼저 정렬한다.
            
            오름차순 정렬문 asc는 기본값으로 생략가능하다. 오름차순 정렬 순서는 내림차순 정렬순서의 역순이다.
*/

-- 고객번호를 기준으로 내림차순 정렬
select * from customer order by cus_no DESC;

/*
    레코드 수정문 문법형식)
        update 테이블명
        set 컬럼명 = 수정할 값, 컬럼명 = 수정할 값 ..
        where 조건식;
*/

--3번 고객번호를 기준으로 고객이름을 신사임당, 고객이메일을 dang@daum.net 으로 변경해 본다.
update customer set cus_name = '신사임당', cus_email='dang@daum.net' where CUS_NO=3;

--3번 고객번호를 기준으로 수정된 고객이름과 고객 이메일을 확인
select cus_name, cus_email from CUSTOMER where cus_no = 3;

/*
    레코드 삭제 쿼리문 문법 형식)
        delete from 테이블명 where 조건식;
*/
insert into customer (cus_no, cus_name, cus_phone, cus_email) values(cus_seq.nextval, '삭제할이름', '010-555-5555', 'del@daum.net');

select * from customer order by cus_no DESC;

--4번 레코드 삭제
delete from customer where cus_no = 4;

COMMIT;