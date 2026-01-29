<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<c:set var="price" value="10000" />

<fmt:formatNumber value="${price}" type="number" var="numberType"/>
<%-- fmt:formatNumber JSTL은 숫자형식, type속성 기본값은 number 인데 숫자형식, 숫자형식은 세자리 수 콤마 --%>

숫자형식 : ${numberType}
<hr>
<c:out value="${price}"/>
<hr>

통화형식 : <fmt:formatNumber value="${price}" type="currency" currencySymbol="원"/>
<%-- type="currency"는 통화형식, currencySymbol 속성은 통화기호 표시이고 type속성값이 currency인 경우만 적용된다. --%>

<hr>
패턴 : <fmt:formatNumber value="${price}" pattern="0000.00"/>
<%-- pattern 속성은 직접 숫자가 출력되는 양식을 지정가능함.--%>
<hr>