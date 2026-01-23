-- [방명록 테이블: tbl_guestbook]
-- 설명 : 사용자들이 남기는 방명록 글을 저장하는 테이블
create table tbl_guestbook(
    gno NUMBER(38) PRIMARY KEY,     -- 글번호 (Primary Key, 시퀀스 사용 권장)
    gname VARCHAR2(50) not null,    -- 작성자 이름    
    gtitle VARCHAR2(200) not NULL,  -- 글제목
    gcont VARCHAR2(4000) not NULL,  -- 글내용 (최대 4000바이트)
    gdate DATE NULL                 -- 등록날짜 ()
);

-- gno-seq 시퀀스 생성
create sequence gno_seq
NOCYCLE;    --임시 메모리 사용 안함