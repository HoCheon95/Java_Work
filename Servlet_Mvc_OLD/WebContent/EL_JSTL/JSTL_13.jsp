<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:requestEncoding value="UTF-8"/>
<%-- post방식으로 전송되는 한글 데이터를 서버에서 받을 때 안깨지게 한다. jsp나 Servlet 자바에서 사용하는 코드인 
request.setCharacterEncoding("UTF-8"); 과 기능이 같다.--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
</head>
<body>
	<form method="post" action="JSTL_13.jsp">
		<label for="addr">주소 입력 : </label>
		<%-- 라벨 for 속성명과 input 입력필드의 id속성명이 같으면 마우스 조작이 불편하신 분들이 입력필드외에 라벨명만 선택해도 입력필드 선택효과가 난다. --%>
		<input type="text" name="addr" id="addr" size="30">
		<input type="submit" value="Confirm">
	</form>
	
	<hr>
	입력하신 주소는 <strong>${param.addr}</strong>입니다.
	
</body>
</html>