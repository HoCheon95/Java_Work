<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료실 입력폼</title>
<link rel="stylesheet" type="text/css" href="./css/bbs.css" />
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
    // ${msg}는 RedirectAttributes에 담긴 값을 가져옵니다.
    var message = "${msg}"; 
    
    // 2. 메시지가 존재할 때만 alert창을 띄웁니다.
    if (message != "" && message != null) {
        alert(message);
    }
</script>
<%--jQuery 라이브러리 CDN 방식으로 읽어오기 --%>
<script src="./js/bbs.js"></script> <%-- 사용자 자료실 유효성 검증 경고 메시지를 자바스크립트와 jQuery를 사용해서 띄우는 파일 외부포함파일로 처리해서 읽어옴  --%>
</head>
<body>
   <div id="bsW_wrap">
      <h2 class="bsW_title">다중파일 업로드 자료실 입력</h2>
      <form method="post" action="bbs_write_ok.do"
         onsubmit="return write_check();" enctype="multipart/form-data">
         <%-- 첫번째, 자료실 기능에서 첨부 파일 업로드 시에는 method=post만 가능하다.
              두번째, 첨부파일 기능이 있는 자료실을 만들기 위해서는 폼태그내에 enctype="multipart/form-data" 속성을 꼭 지정해야 한다. 파일첨부해서
             서버로 전송되는 첨부된 파일을 포함한 일반문자를 바이너리 모드  (binary mode) 즉 이진파일이라 부른다. 그렇지 않은 일반게시판에서 서버로 전송되는
              데이터를 ascii mode(아스키 모드 -> 텍스트 전용 전송) 파일 이라 한다. --%>
         <table id="bsW_t">
          <tr>
               <th>글쓴이</th>
               <td><input name="bbs_name" id="bbs_name" size="14" /></td>
            </tr>
            <tr>
               <th>글제목</th>
               <td><input name="bbs_title" id="bbs_title" size="33" /></td>
            </tr>
            <tr>
               <th>비밀번호</th>
               <td><input type="password" name="bbs_pwd" id="bbs_pwd"   size="14" /></td>
            </tr>
            <tr>
               <th>글내용</th>
               <td><textarea name="bbs_cont" id="bbs_cont" rows="8" cols="34"></textarea></td>
            </tr>
            <tr>
               <th>파일첨부</th>
               <td><input type="file" name="bbs_file" multiple /></td> <%-- multiple 속성을 사용하면 다중파일을 선택할 수 있다. --%>
            </tr>
         </table>
         <div id="bsW_menu">
            <input type="submit" value="입력" /> <input type="reset" value="취소"
               onclick="$('#bbs_name').focus();"> <input type="button"
               value="목록" onclick="location='bbs_list.do?page=${page}';"> <%-- 페이징에서 내가 본 쪽번호로 바로 이동하기 위한 책갈피 기능을 구현하기 위
               해서는 *.do?page=쪽번호를 get방식으로 전달해야 한다. --%>
         </div>
      </form>
   </div>
</body>
</html>