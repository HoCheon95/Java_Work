<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> </title>
</head>
<body>
	<c:set var="now" value="<%=new java.util.Date()%>"/>
	<%-- now JSTL 변수에 날짜와 시간 객체를 생성해서 저장 --%>
	
	<fmt:formatDate value="${now}" type="date" dateStyle="full"/><hr>
	<%-- fmt:formatDate JSTL 태그는 날짜 정보를 출력할 때 사용. type="date" 는 날짜값을 가짐. 기본값이다. 
	dateStyle="full" full형태의 날짜 출력 --%>
	
	<fmt:formatDate value="${now}" type="date" dateStyle="short"/><hr>
	<%-- short는 간단한 형태의 날짜 출력 --%>
	
	<fmt:formatDate value="${now}" type="time"/><hr>
	<%-- type="time"은 시간값 출력 --%>
	
	<fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full"/><hr>
	<%-- type="both"는 날짜와 시간값 출력, timeStyle="full" full형태의 시간값 출력형태  --%>
</body>
</html>