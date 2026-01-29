<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL(표현언어:Expression Language) </title>
<%-- EL은 외부라이브러리가 필요 없다 --%>
</head>
<body>
	<h3>표현언어에서 사용가능한 데이터</h3>
	[1] 정수형 : ${100}<HR>
	[2] 실수숫자형 : ${100.3}<hr>
	[3] 문자열형 : ${"홍길동"}<hr>
	[4] 논리형 : ${true}<hr>
	[5] null : ${null}<hr>
	
	<h3>표현언어 연산자 종류</h3>
	<%//jsp 의 스크립트 요소중 스크립트 릿이다. 이 영역은 자바 문법을 따라간다.

        String cityName = null;
	%>
    \${100+7} = ${100+7}<hr>
    \${7/2} = ${7/2}<hr> <%-- 자바와는 다르게 표현언어는 정수 숫자를 나눗셈하면 몫과 나머지를 함께 구함 --%>
    \${5 div 2} = ${5 div 2}<hr> <%-- div는 표현언어에서 나눗셈 연산을 한다. --%>
    \${5 mod 2} = ${5 mod 2}<hr> <%-- mod는 표현언어에서 나머지 연산을 수행한다. --%>
    \${2 gt 7} : ${2 gt 7}<hr> <%-- gt는 ~보다 크다 --%>
    \${empty cityName} : ${empty cityName}<hr> <%-- empty는 cityName이 비어있다면(null) true --%>
</body>
</html>