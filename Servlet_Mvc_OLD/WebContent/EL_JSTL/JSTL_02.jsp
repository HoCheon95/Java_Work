<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="fruit" value="${param.name}"/> <%-- 피라미터 이름 name에 실려온 값을 fruit JSTL변수에
저장한다. JSTL_02.jsp?name=값 형태의 쿼리스트링 방식으로 웹주소창에 노출되는 get방식으로 값을 전달해야 한다. --%>

피라미터 name에 실려온 값:
<c:if test="${!empty fruit}"> <%-- c:if JSTL 조건문이다. --%>
	<c:out value="${fruit}"/>
</c:if>

<hr>

<c:choose> <%-- c:choose JSTL 코어태그는 다중 조건문을 처리할 때 사용 --%>
	<c:when test="${fruit == 'apple'}"> <%-- c:when 코어태그는 test 조건이 참일 때 실행 --%>
		<c:out value="${fruit}"/> : 사과
	</c:when>
	<c:when test="${fruit == 'orange'}">
		${fruit} : 오렌지
	</c:when>
	<c:otherwise>해당사항 없음</c:otherwise><%-- c:otherwise 코어태그는 조건을 만족하지 못할 때 실행 --%>
</c:choose>