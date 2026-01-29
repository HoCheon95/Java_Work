-- guestbook 방명록 테이블 생성
create table guestbook(
 gno int primary key --방명록 번호
 , gname VARCHAR(50) not null --글쓴이
 , gtitle VARCHAR2(200) not null --글제목
 , gcontent VARCHAR2(4000) not null --글내용
 , gdate date --등록날짜
);

select * from guestbook order by gno desc;

--gno8_seq 시쿼스 생성
create SEQUENCE gno8_seq
start with 1 --1부터 시작, 기본값 생략 가능
increment by 1 --1씩 증가, 기본값 생략가능
nocache --임시 메모리 사용안함
nocycle; --시퀀스 최대값, 최소값 도달시 다시 처음부터 반복안함. 기본값 생략가능

--gno8_seq다음 시퀀스 번호값 확인
select gno8_seq.nextval as "시퀀스번호값" from dual;

