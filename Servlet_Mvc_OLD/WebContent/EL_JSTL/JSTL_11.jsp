<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<h2>JSTL 함수 사용</h2>

<c:set var="cityName" value="seoul city"/>
문자열 길이 : ${fn:length(cityName)}<hr>
영문대문자로 변경 : ${fn:toUpperCase(cityName)}<hr>
첫문자를 0부터 시작해서 0이상 5미만 사이의 문자 추출 : ${fn:substring(cityName,0,5)}<hr>
빈공백을-로 변경 : ${fn:replace(cityName, " ","-")}<hr> <%-- seoul-city가 출력 --%>
<hr>

<c:set var="tokens" value="1,2,3,4,5"/>
<c:set var="array" value="${fn:split(tokens, ',')}"/>
<%-- , 구분자를 기준으로 문자열을 분리해서 분리된 문자인 토큰 문자를 배열로 반환 --%>
배열원소값을 -로 결합 : ${fn:join(array,"-")}<hr>