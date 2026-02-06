<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료실 수정폼</title>
<link rel="stylesheet" type="text/css" href="./css/bbs.css" />
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<script src="./js/bbs.js"></script>
</head>
<body>
   <div id="bsW_wrap">
      <h2 class="bsW_title">다중파일 업로드 자료실 수정</h2>
      <form method="post" action="bbs_edit_ok.do" onsubmit="return write_check();" enctype="multipart/form-data">
        <%-- 첫번째, 자료실 기능에서 첨부 파일 업로드 시에는 method=post만 가능하다.
              두번째, 첨부파일 기능이 있는 자료실을 만들기 위해서는 폼태그내에 enctype="multipart/form-data" 속성을 꼭 지정해야 한다. 파일첨부해서
             서버로 전송되는 첨부된 파일을 포함한 일반문자를 바이너리 모드  (binary mode) 즉 이진파일이라 부른다. 그렇지 않은 일반게시판에서 서버로 전송되는
              데이터를 ascii mode(아스키 모드 -> 텍스트 전용 전송) 파일 이라 한다. --%>
  
          <%-- 자료실 번호 히든값--%>
          <input type="hidden" name="bbs_no" value="${b.bbs_no}" >
          <%-- 페이징 목록에서 책갈피 기능 구현을 위한 쪽번호 히든값 --%>
          <input type="hidden" name="page" value="${page}" >
          
         <table id="bsW_t">
            <tr>
               <th>글쓴이</th>
               <td><input name="bbs_name" id="bbs_name" size="14" value="${b.bbs_name}"/></td>
            </tr>
            <tr>
               <th>글제목</th>
               <td><input name="bbs_title" id="bbs_title" size="33" value="${b.bbs_title}" /></td>
            </tr>
            <tr>
               <th>비밀번호</th>
               <td><input type="password" name="bbs_pwd" id="bbs_pwd"   size="14" /></td>
            </tr>
            <tr>
               <th>글내용</th>
               <td><textarea name="bbs_cont" id="bbs_cont" rows="8"
                cols="34">${b.bbs_cont}</textarea></td>
            </tr>
            <tr>
               <th>파일첨부</th>
               <td><input type="file" name="bbs_file" multiple /></td>
         </table>
         <div id="bsW_menu">
            <input type="submit" value="수정" /> <input type="reset" value="취소"
               onclick="$('#bbs_name').focus();"> <input type="button"
               value="목록" onclick="location='bbs_list.do?page=${page}';">
         </div>
      </form>
   </div>
</body>
</html>



