<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 MVC 방명록 입력폼</title>
<script type="text/javascript" src="./js/jquery-3.7.1.min.js"></script>
<%-- jQuery 라이브러리 읽어오기 --%>
<script src="./js/guestbook.js"></script>
<%-- guestbook.js 자바스크립트 외부 포함파일을 읽어온다. --%>
</head>
<body>
<form method="post" action="guest_write_ok" onsubmit="return check();">
  <%--
    post방식 특징)
     1. 브라우저 주소창에 서버로 전달되는 값이 보이지 않는다.보안상 좋다.
     2. 즉,본문내용속에 포함되어 값이 서버로 전달된다. 서버로 보내는 자료길이 제한도 없다.
    action="게시판 저장 서버매핑주소 설정" -> guest_write_ok
    onsubmit은 서버로 자료 보내는 이벤트 핸들러인 사건처리기이다. 서버로 제출 사건 이벤트를 처리하면서 check()함수를 호출한다. 
   --%>
   <table border="1">
    <tr>
     <th colspan="2">서블릿 MVC 방명록 입력폼</th>
    </tr>
    <tr>
     <th>글쓴이</th>
     <td><input type="text" name="gname" id="gname" size="36" ></td>
    </tr>
    <tr>
     <th>제목</th>
     <td><input type="text" name="gtitle" id="gtitle" size="36" ></td>
    </tr>
    <tr>
     <th>글내용</th>
     <td>
      <textarea name="gcontent" id="gcontent" rows="10" cols="36"></textarea>
     </td>
    </tr>
    <tr>
     <th colspan="2">
      <input type="submit" value="입력" >
      <input type="reset" value="취소" onclick="$('#gname').focus();" >
     </th>
    </tr>
   </table>
 </form>
</body>
</html>