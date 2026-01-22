--tbl_dept 부서테이블 생성
create table tbl_dept(
    deptno int primary key --부서번호
    , dname varchar2(50) --부서명
    , LOC varchar2(200) --부서가 있는 지역
);

insert into tbl_dept VALUES(11, '개발부', '대전시');
insert into tbl_dept VALUES(12,'디자인부터','경기도 성남시 판교');

select * from tbl_dept order by deptno asc; --부서번호를 기준으로 오름차순 정렬(asc->생략가능),
-- 작은 숫자 부서번호부터 먼저 정렬된다.