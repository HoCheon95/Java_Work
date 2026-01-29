<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 MVC 방명록 목록 </title>
</head>
<body>
	<table border="1">
		<tr>
			<th colspan="4">서블릿 MVC 방명록 목록보기</th>
		</tr>
		<tr>
			<th>번호</th><th>글제목</th><th>글쓴이</th><th>등록날짜</th>
		</tr>
		
		<c:if test="${!empty g_list}">
			<c:forEach var="g" items="${g_list}">
				<tr>
					<th>${g.gno}</th>
					<th>${g.gtitle}</th>
					<th>${g.gname}</th>
					<th>${fn:substring(g.gdate,0,10)}</th><%-- 0이상 10미만 사이의 년월일을 반환 --%>
				</tr>
			</c:forEach>
		</c:if>
		<tr>
			<th colspan="4">
				<input type="button" value="글쓰기" onclick="location='guest_write';">
			</th>
		</tr>
	</table>
</body>
</html>