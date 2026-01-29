<%@ page contentType="text/html; charset=UTF-8"%>
<%
	request.setAttribute("cityName", "대전시");//cityName 문자열 속성 키이름에 Object타입으로 업캐스팅 하면서 대전시를 저장
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
</head>
<body>
	<h2>닷(.) 연산자로 접근</h2>
	${requestScope.cityName}<hr> <%-- requestScope는 jsp내장객체중 request에 해당한다. 
	request객체는 사용자 입력폼에서 입력한 데이터를 서버로 가져오는 역할을 수행한다. 
	cityName키이름 값 대전시를 가져옴 --%>
	${param.id}<hr> <%-- 파라미터 이름 id에 실려온 값을 출력한다. EL_02.jsp?id=값 형태로 웨브라우저
	 주소창에 노출되는 get방식으로 값을 전달해야 한다. 이런 방식을 쿼리스트링(Query String) 이라고 한다.--%>
	 
	 <h2>브라켓 연산자([])로 접근</h2>
	 ${requestScope["cityName"]}<hr>
	 ${param["id"]}<hr>
	 
	 <h2>jsp 스크립트 요소 중 하나인 표현식</h2>
	 <%=request.getAttribute("cityName") %><hr><%-- cityName 키이름 값 대전시를 가져와서 출력 --%>
	 <%=request.getParameter("id") %><hr><%-- id 파라미터 값을 가져와서 출력, <%=은 표현식으로 출력용도로 사용한다. --%>
	 
	 
</body>
</html>