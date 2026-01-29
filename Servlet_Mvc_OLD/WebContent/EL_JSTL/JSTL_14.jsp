<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<%-- JSTL sql 태그라이브러리는 데이터베이스를 연결해서 쿼리문을 수행하게 한다. --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
</head>
<body>
	<h2>JSTL sql 태그 라이브러리 사용 예제</h2>
	<sql:setDataSource var="con" driver="oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
								 user="week" password="week"/>
	<%-- 데이터베이스 연결 con생성, <sql:setDataSource JSTL태그는 db연결 정보를 설정(드라이버, URL, 사용자명, 비번) --%>
	
	<sql:update dataSource="${con}"> <%-- <sql:update JSTL 태그는 insert,update,delete SQL문을 실행한다. --%>
		insert into test values(1, '홍길동')
	</sql:update>
	
	<sql:update dataSource="${con}">
		insert into test values(2,'이순신')
	</sql:update>
	
	<sql:query var="rs" dataSource="${con}">
		<%-- <sql:query JSTL 태그는 select문 실행할 때 사용한다. 결과 레코드는 rs에 저장 --%>
		select * from test
	</sql:query>
	
	<c:forEach var="data" items="${rs.rows}">
		<%-- ${rs.rows}는 test 테이블에서 조회된 복수개의 행 레코드 목록 즉 각 행 rows는 한 줄 (row)행을 나타내며,
		${data.name}으로 각 컬럼명 name으로 부터 레코드를 가져온다. --%>
		${data.num}
		${data.name}<hr>
	</c:forEach>
</body>
</html>