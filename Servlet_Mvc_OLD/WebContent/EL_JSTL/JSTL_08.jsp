<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>1부터 100 까지의 자연수 중에서 홀수/짝수들의 누적합</h2>

<c:forEach var="k" begin="1" end="100" step="2">
	<c:set var="sum" value="${sum+k}" /> <%-- 홀수들의 누적합 --%>
</c:forEach>
첫번째 홀수들의 누적합 = <strong><c:out value="${sum}"/></strong>
<hr>
<%-- 
문제) JSTL c:forEach 반복문과 c:if 조건문, mod 표현식 EL 나머지 연산을 사용해서
1부터 100까지의 자연수 중에서 짝수들의 누적합을 구해보는 코드를 만들어 본다.
--%>
<c:forEach var="i" begin="1" end="100" step="1">
	<c:if test="${i mod 2==0}">
		<c:set var="total" value="${total+i}" /><%-- 짝수들의 누적합 --%>
	</c:if>
	
</c:forEach>
두번째 짝수들의 누적합 = <strong><c:out value="${total}"/></strong>
<hr>

<c:set var="sum" value="0"/>
<c:forEach var="j" begin="1" end="100">
	<c:if test="${j % 2 == 1}"><%-- 2로 나눈 나머지 값이 1과 같을 때 실행 -> %, mod는 EL에서 나머지 연산자이다. 즉 홀수 일 때 실행된다.--%>
		<c:set var="sum" value="${j + sum}"/><%-- 홀수들의 누적합 --%>
	</c:if> 
</c:forEach>
세번째 홀수들의 누적합 = <b>${sum}</b>
<hr>

<h2>7단 구구단 출력</h2>
<ul>
	<c:forEach var="k" begin="1" end="9">
		<li>7 * <c:out value="${k}" /> = ${7*k}</li>
	</c:forEach>
</ul>