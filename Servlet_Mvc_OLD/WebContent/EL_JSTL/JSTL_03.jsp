<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	int[] arr = {10,20,30};
	request.setAttribute("arr", arr);//좌측 문자열 속성 키이름 arr에 오른쪽 문자열 배열명 arr저장
%>

arr 정수 배열원소값 출력:<br>
<c:forEach var="i" items="${arr}" begin="0" end="2">
	<%-- begin속성은 시작인덱스 값, end속성은 끝 인덱스 값 -> 배열주소 인덱스 번호 c:forEach는 JSTL 코어태그 반복문--%>
	
	${i}<br>
	
	<c:set var="total" value="${total + i}" /> <%-- 배열원소 누적합 --%>
</c:forEach>
<hr>
arr 배열원소 누적합 =${total}<hr>

**홀수값 출력<br>
<c:forEach var="k" begin="1" end="9" step="2">

	<%-- step은 증가값, step은 반복 증가값을 지정하는 데 양의정수만 허용한다. step="0"도 안된다.
	생략하면 기본값은 1씩 증가이다. --%>
	
	<c:out value="${k}"/> &nbsp;&nbsp; 
	<%-- %nbsp;을 한번 사용하면 한칸의 빈공백을 만들고, 두번 사용 하면 두 칸의 빈공백을 만든다. --%>
	
</c:forEach>
<hr>

<c:forTokens var="cityName" items="서울,부산,대전" delims=",">
	<%-- ,를 기준으로 문자열을 분리한다. 분리된 문자는 토큰 문자이다. --%>
	<c:out value="${cityName}"/> <br>
</c:forTokens>
<hr>