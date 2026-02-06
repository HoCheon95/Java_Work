<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료실 내용보기</title>
<link rel="stylesheet" type="text/css" href="./css/bbs.css" />

</head>
<body>
	<div id="bsC_wrap">
		<h2 class="bsC_title">자료실 내용보기</h2>
		<table id="bsC_t">
			<tr>
				<th>제목</th>
				<td>${b.bbs_title}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${bcont}</td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${b.bbs_hit}</td>
			</tr>
			<c:if test="${b.bbs_attached_file == 7}">
				<%--첨부파일이 있는경우--%>
				<tr>
					<th>첨부파일명</th>
					<td>
					 <c:forEach var="file" items="${fileList}">
					  <a href="./upload/${file.bbs_stored_name}">${file.bbs_stored_name}</a>
					 </c:forEach>
					</td>
				</tr>
			</c:if>
		</table>
		<div id="bsC_menu">
			<input type="button" value="답변"
				onclick="location='bbs_cont.do?bbs_no=${b.bbs_no}&page=${page}&state=reply';" />
			<input type="button" value="수정"
				onclick="location='bbs_cont.do?bbs_no=${b.bbs_no}&page=${page}&state=edit';" />
			<input type="button" value="삭제"
				onclick="location='bbs_cont.do?bbs_no=${b.bbs_no}&page=${page}&state=del';" />
			<input type="button" value="목록"
				onclick="location='admin_bbs_list.do?page=${page}';" />
		</div>
	</div>
</body>
</html>