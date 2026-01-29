<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="true">
	무조건 참이어서 실행된다.<hr>
</c:if>

<c:if test="${param.name == 'hong'}">
	name 피라미터 값 : <strong></strong>
</c:if>

<c:if test="${param.age >= 20 }">
	당신의 나이는 20세 이상입니다.
</c:if>

<hr>

<c:choose>
	<c:when test="${param.name =='hong'}">
		당신의 성은 <b>${param.name}</b>입니다.
	</c:when>
	
	<c:when test="${param.age >= 20}">
		당신의 나이는 20세 이상입니다.
	</c:when>
	
	<c:otherwise>당신의 성은 'hong'이 아니고, 나이도 20세 이상이 아닙니다.</c:otherwise>
</c:choose>

<%-- JSTL_07.jsp?name=hone&age=20 &기호로 구분해서 웹주소창에 노출되는 get방식(쿼리스트링방식)으로
name 피라미터이름에 hong값을 담고, age 피라미터이름에 20을 담아서 복수개의 값을 전달한다. 이 방식으로 실행해야
원하는 값을 출력할 수 있다. --%>