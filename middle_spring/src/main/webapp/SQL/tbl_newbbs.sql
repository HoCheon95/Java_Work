--tbl_newbbs 자료실 테이블 생성(종속관계에서 기본키가 있는 주테이블)
create table tbL_newbbs(
    bbs_no number(38) primary key --자료실 번호
    , bbs_name varchar2(50) not null --글쓴이
    , bbs_title varchar2(200) not null --글제목
    , bbs_pwd varchar2(20) not null --비번
    , bbs_cont varchar2(4000) not null --글내용
    , bbs_hit number(38) default 0 --조회수, default 0 제약조건을 주면 bbs_hit컬럼에 굳이 레코드를 저장하지 않아도 기본값 정수 숫자 0이 저장됨.
    , bbs_ref number(38) --관리자 답변글과 관련된 컬럼 -> 원본글과 답변글을 묶어주는 글그룹번호 역할
    , bbs_step number(38) --관리자 답변글과 관련된 컬럼 -> 원본글이면 0, 0이 아니면 답변글 즉 원본글과 답변글을 구분해 주는 번호값이면서 몇번째 답변글 인가를 알려줌(첫번째 답변글이면 1, 두번째 답변글이면 2)
    , bbs_level number(38) --답변글 정렬순서
    , bbs_date date --등록날짜
);

--첨부파일이 있는 경우만 7 정수숫자값을 저장하는 컬럼 추가, 해당 컬럼값이 null이면 첨부파일이 없는 경우
alter table tbl_newbbs
add bbs_attached_file number(38); --bbs_attached_file 컬럼 추가

select * from tbl_newbbs order by bbs_no desc; --번호를 기준으로 내림차순 정렬 -> 큰 숫자 번호값이 먼저 정렬된다.

--bbs_no컬럼 정수숫자 레코드값으로 활용할 newbbs_no_seq 시퀀스 생성
create sequence newbbs_no_seq
start with 1 --1부터 시작 옵션, 기본값으로 생략가능
increment by 1 --1씩 증가 옵션, 기본값으로 생략가능
nocycle --시퀀스 최대값 또는 최소값 도달시 다시 처음부터 반복하지 않음. 기본값 생략가능
nocache; --임시 메모리 사용안함.

--newbbs_no_seq 시퀀스 다음 번호값 확인
select newbbs_no_seq.nextval as "다음 시퀀스 번호값" from dual;

--한개 파일 또는 다중 파일 업로드 되는 파일정보를 저장하는 종속테이블 tbl_newbbs_file 테이블 설계 생성
create table tbl_newbbs_file(
    bbs_file_no number(38) primary key --번호
    , bbs_no number(38) --FK(외래키)로 설정 -> tb_newbbs 주인테이블의 기본키 컬럼 bbs_no 자료실 번호값만 저장됨.
    , bbs_original_name varchar2(255) --첨부된 원본파일명
    , bbs_stored_name varchar2(255) --중복방지를 위해서 변경된 파일명
    , bbs_file_path varchar2(1000) --첨부파일 경로
    , bbs_file_size number(38) --첨부된 파일 크기
    , upload_date date default sysdate 
    --파일첨부되는 등록날짜, default sysdate 기본키제약조건을 설정하면 해당컬럼에 굳이 날짜값을 저장하지 않아도 sysdate 오라클 날짜함수에 의해서 저장시 오늘날짜시간값이 기본 값으로 저장됨.
    , foreign key (bbs_no) references tbl_newbbs(bbs_no) on delete cascade 
    --외래키인 bbs_no컬럼이 주테이블 tbl_newbbs의 기본키 컬럼 bbs_no를 참조 즉 가리키고 있음. 옵션으로 on delete cascade를 주면 주테이블 레코드
    --삭제시 자식 종속테이블의 관련 레코드도 함께 자동으로 삭제된다.
);

select * from tbl_newbbs_file order by bbs_file_no desc;

--bbs_file_no 컬럼에 정수숫자 레코드값으로 호라용할 시퀀스 생성
create sequence file_no_seq --file_no_seq 시퀀스 생성
nocache; --start with 1, increment by 1, nocycle 옵션은 기본값이어서 생략함.

select file_no_seq.nextval as "file_no_seq 다음 시퀀스 번호값" from dual;