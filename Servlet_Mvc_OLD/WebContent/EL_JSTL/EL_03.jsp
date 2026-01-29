<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");//method=post 방식으로 전송받은 한글을 안깨지게 한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
</head>
<body>
	<form method="post" action="EL_03.jsp">
		<label for="name">이름</label>
		<%-- label for 속성명과 input 입력필드 id속성명이 같으면 서로 연결이 되어져서 나이 드신분이나 마우스 조작이
		불편하신 분들이 입력필드외에 라벨명만 선택해도 입력필드 선택효과가 난다. 주로 복지 관련사이트에서 많이 활용된다. --%>
		<input type="text" name="name" id="name" size="14" value="${param.name}}">
		<%-- type속성을 생략하면 기본값을 입력필드인 text이다. --%>
		<button type="submit">제출확인</button>
		<hr>
		<h3>입력하신 이름은 ${param.name}입니다.</h3>
	</form>
</body>
</html>