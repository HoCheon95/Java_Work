<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="nara" value="${' '}"/>

<c:if test="${nara != null}">
	국가명 : <c:out value="${nara}"/>
</c:if>

<hr>

<c:if test="${!empty nara}">
	국가명 : ${nara}
</c:if>

<hr>

<c:choose>
	<c:when test="${nara == 'korea'}">
		${nara} 의 겨울은 춥다.
	</c:when>
	<c:when test="${nara == 'japen'}">
		${nara} 의 겨울은 덜 춥다.
	</c:when>
	<c:otherwise >그 외의 나라는 알 수 없다.</c:otherwise>
</c:choose>