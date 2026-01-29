<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- JSTL 코어 태그립, JSTL(JSP Standard Tag Library 의 약어)은 jsp 뷰페이지 문법으로 많이 사용되어진다.
사용자 저으이 태그인 커스텀 태그이지만 전 세계적으로 공인을 받은 표준 커스텀 태그이다. 스프링 프로젝트 뷰페이지 문법으로도
과거부터 많이 사용되어 지고 있다. --%>

<c:out value="JSTL 출력문이다." /> <%-- c:out은 JSTL에서 출력할 때 사용한다.  --%>

<c:set var="msg" value="${'hello'}" /> <%-- JSTL msg 변수에 value 속성값을 저장.
c:set은 JSTL태그는 변수 설정할 때 사용한다. --%>

<c:set var="age" scope="page">
	${20} <%-- c:set 쌍태그로 age JSTL 변수에 20을 저장. scope="page" 는 변수 age의 유효범위(scope)를  jsp페이지내로 제한한다는 의미이다. --%>
</c:set>

<hr>

<c:out value="${msg}" /> <%-- msg 변수값 출력 --%>
<hr>
나이:${age}<hr> <%-- ${age} EL로 출력 --%>

<c:remove var="age" scope="page"/> <%-- c:remove JSTL 코어 태그로 age변수 제거 --%>
나이 : <c:out value="${age}"/>
<hr>

<c:catch var="errmsg"> <%-- c:catch JSTL 태그는 예외 처리  --%>
	예외 발생전
	<%=7/0%> <%-- 자바에서 정수숫자를 0으로 나누면 예외 발생한다. 예외 에러 메시지는 errmsg변수에 저장 --%>
	예외 발생후 <%-- 이 문장 수행안함. --%>
</c:catch>
<hr>
정수 숫자를 0으로 나눌때 발생하는 예외 에러 메시지 : <c:out value="${errmsg}"/>
<hr>

