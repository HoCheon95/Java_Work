<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:url value="/EL_JSTL/images/sun.jpg" var="test"/>

<h2><c:out value="${test}" /></h2>
<img src="${test}" width="300" height="250" alt="한여름 태양"/>