<%@ page contentType="text/html; charset=UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
 Java EE 기반 (Tomcat 9 이하) -> 기존에 가장 많이 쓰이던 주소--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%-- 오라클(Oracle)이 Java EE 프로젝트를 이클립스 재단으로 넘기면서 'Java'라는 상표권을 사용하지 못하게 되었다. 그래서 프로젝트 이름이 
**Jakarta(자카르타)**로 변경되었고, 이에 따라 패키지명과 태그 라이브러리 URI 주소도 모두 변경된 것이다. 

Jakarta EE 기반 (Tomcat 10 이상)
최신 환경(Tomcat 10, 11 등)을 사용 중이라면 jakarta 문구가 포함된 주소를 사용
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<link rel="stylesheet" type="text/css" href="./css/member.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%-- 
jQuery CDN 방식이란, jQuery 라이브러리 파일을 본인의 컴퓨터 서버에 직접 다운로드하여 저장하지 않고, 온라인 인터넷 연결된 상태에서 구글(Google)이나 
마이크로소프트(Microsoft) 등에서 제공하는 외부 서버의 경로(URL)를 연결하여 사용하는 방식이다.
CDN은 Content Delivery Network의 약자로, 전 세계 곳곳에 서버를 두어 사용자와 가장 가까운 서버에서 파일을 빠르게 전달해 주는 시스템을 의미한다. --%>
<script type="text/javascript">
    // ${msg}는 RedirectAttributes에 담긴 값을 가져옵니다.
    var message = "${msg}"; 
    
    // 2. 메시지가 존재할 때만 alert창을 띄웁니다.
    if (message != "" && message != null) {
        alert(message);
    }
</script>
<script>
 function login_check(){
    if($.trim($("#login_id").val())==""){
       alert("로그인 아이디를 입력하세요!");
       $("#login_id").val("").focus();
       return false;
    }
    if($.trim($("#login_pwd").val())==""){
       alert("로그인 비번을 입력하세요!");
       $("#login_pwd").val("").focus();
       return false;
    }
 }//로그인 인증 유효성 검증
 
 //비번찾기
 function pwd_find(){
    $url="pwd_find.do";//매핑주소
    window.open($url,"비번검색","width=400px,height=300px,scrollbars=yes");
    //open(공지창경로,공지창이름,속성) 메서드로 폭이 400픽셀,높이가 300픽셀,스크롤바가 생성되는 새로운 공지창을 만든다.
 }
</script>
</head>
<body>
   <c:if test="${empty id}">
      <%--로그인 전 화면 --%>
      <div id="Login_wrap">
         <h2 class="Login_title">로그인 폼</h2>
         <form method="post" action="member_login_ok.do"
            onsubmit="return login_check();">
            <table id="Login_t">
               <tr>
                  <th>아이디</th>
                  <td><input name="login_id" id="login_id" size="14"
                     tabindex="1" /> <%-- tabindex="1"로 설정하면 탭키를 눌렀을
     때 첫번째로 포커스를 가진다. --%></td>
                  <th rowspan="2">
                     <%--rowspan="2" 2개행을 합침 --%> <input type="submit" value="로그인" />
                  </th>
               </tr>
               <tr>
                  <th>비밀번호</th>
                  <td><input type="password" name="login_pwd" id="login_pwd"
                     size="14" tabindex="2" /></td>
               </tr>
            </table>
            <div id="Login_menu">
               <input type="button" value="비번찾기" onclick="pwd_find();" /> <input
                  type="button" value="회원가입" onclick="location='member_join.do';" />
            </div>
         </form>
      </div>
   </c:if>
   <c:if test="${!empty id}">
      <%--로그인 이후 화면 --%>
      <div id="Index_wrap">
         <h2 class="Index_title">로그인 후 메인화면</h2>
         <form method="post" action="member_logout.do">
            <table id="Index_t">
               <tr>
                  <th><input type="button" value="정보수정"
                     onclick="location='member_edit.do';" /> <input type="button"
                     value="회원탈퇴" onclick="location='member_del.do';" /> <input
                     type="submit" value="로그아웃" /></th>
               </tr>
               <tr>
                  <th>${id}님 로그인을 환영합니다.</th>
               </tr>
            </table>
         </form>
      </div>
   </c:if>
</body>
</html>
