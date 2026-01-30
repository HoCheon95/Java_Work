--member 사용자 회원관리 테이블 생성
CREATE TABLE member(
    mam_id VARCHAR2(50) PRIMARY KEY --회원 아이디
    , mem_pwd VARCHAR2(200) NOT NULL --비밀번호
    , mem_name VARCHAR2(100) NOT NULL --회원이름
    , mem_zip VARCHAR2(10) NOT NULL --우편번호
    , mem_zip2 VARCHAR2(10) NOT NULL --우편번호
    , mem_addr varchar2(200) NOT NULL --주소
    , mem_addr2 VARCHAR2(100) NOT NULL --나머지 주소
    , mem_phone01 VARCHAR2(10) --첫번째 자리 폰번호
    , mem_phone02 varchar2(10) --두번째 자리 폰번호
    , mem_phone03 varchar2(10) --세번째 자리 폰번호
    , mail_id varchar2(100) --메일 아이디
    , mail_domain varchar2(100) --메일 도메인
    , mem_date date --가입날짜
    , mem_state number(38) --가입회원 1, 탈퇴회원 2
    , mem_delcont VARCHAR2(4000) --탈퇴사유
    , mem_deldate date --탈퇴날짜
);

select * from member order by mem_id asc;
--아이디를 기준으로 오름차순 정렬(아이디가 영문 알파벳 순번으로 정렬된다. asc문은 생략가능)

--회원가입 폼에서 아이디 중복 검색 때문에 샘플 회원 저장
insert into member (mem_id, mem_pwd, mem_name, mem_zip,mem_zip2,MEM_ADDR,MEM_ADDR2, MEM_PHONE01,MEM_PHONE02,
MEM_PHONE03, MAIL_ID,MAIL_DOMAIN,MEM_DATE,MEM_STATE)
VALUES('aaaaaa', '77777', '홍길동', '123', '456', '서울시 강남구 테헤란로길', '00빌딩 00호', '010',
'8888','9999','aaaaaa', 'daum.net', sysdate,1);

--우편/주소 테이블(zipcode)
create table zipcode(
    no NUMBER(38) PRIMARY KEY
    , zipcode varchar2(20) --우편번호
    , sido varchar2(50) --시도
    , gugun varchar2(50) --구군
    , dong varchar2(50) --읍면동, 길주소
    , bunhi varchar(50) --번지
);

INSERT INTO ZIPCODE VALUES(1, '123-789', '대전시', '중구','오류동','00빌딩');
select * from ZIPCODE;