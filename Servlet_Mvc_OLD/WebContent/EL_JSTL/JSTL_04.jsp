<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="http://localhost:8023/Servlet_Mvc_OLD/EL_JSTL/city_name.jsp" var ="data"/>
<%-- c:import JSTL 코어 태그는 url속성을 사용해서 외부 자원의 결과를 가져온다. 결국 외부 자원의 결과값을 data JSIL변수에 저장 --%>

${data}<hr>