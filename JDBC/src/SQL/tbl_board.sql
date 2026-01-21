--tbl_board
create table tbl_board(
 bno number(38) primary key --게시판 번호
 ,bname varchar2(50) not null --게시판 글쓴이
 ,btitle varchar2(500) not null -- 게시판 글제목
 ,bcont varchar2(4000) not null--글내용
 ,bdate date --등록날짜
);

select * from tbl_board order by bno desc;--게시판번호를 기준으로 내림차순 정렬

--bno_seq 시퀀스 생성
create sequence bno_seq
nocache;--임시 메모리 사용 안함.

--bno_seq.nextval 다음 시퀀스 번호값 확인
select bno_seq.nextval from dual;

select * from TBL_BOARD;

commit;