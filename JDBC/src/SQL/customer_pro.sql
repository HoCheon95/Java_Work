--customer_pro 저장프로시저 생성문
create or replace procedure customer_pro
--or replace 옵션은 재생성
(
    cusname out customer.cus_name%type, --cusname 변수는 customer테이블의 cus_name 컬럼 타입으로 지정된다.
    --out모드 매개변수는 컬럼에 저장된 레코드값을 되돌려 받을 때 사용
    cusphone out customer.cus_phone%type,
    cusemail out customer.cus_email%type,
    cusno IN customer.cus_no%type-- in 모드 매개변수는 값을 입력받을 때 사용 -> 고객번호를 입력받음
)
IS
BEGIN
    select cus_name, cus_phone, cus_email into cusname, cusphone, cusemail
    from customer where cus_no = cusno;
    --입력받은 고객번호를 기준으로 오라클 customer 테이블로부터 고개이름, 고객폰번호, 고객이메일을
    --각각 검색해서 cusname, cusphone, cusemail 각 변수에 저장한다.
END;
/