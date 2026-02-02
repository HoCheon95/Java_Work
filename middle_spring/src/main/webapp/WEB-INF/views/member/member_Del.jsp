<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴</title>
<link rel="stylesheet" type="text/css" href="./css/member.css" />
<script src="./js/jquery.js"></script>
<script type="text/javascript">
    // ${msg}는 RedirectAttributes에 담긴 값을 가져옵니다.
    var message = "${msg}"; 
    
    // 2. 메시지가 존재할 때만 alert창을 띄웁니다.
    if (message != "" && message != null) {
        alert(message);
    }
</script>
<script>
 function del_check(){
	 if($.trim($("#del_pwd").val())==""){
		 alert("탈퇴 비번을 입력하세요!");
		 $("#del_pwd").val("").focus();
		 return false;
	 }
	 if($.trim($("#del_cont").val())==""){
		 alert("탈퇴 사유를 입력하세요!");
		 $("#del_cont").val("").focus();
		 return false;
	 }
 }
</script>
</head>
<body>
	<div id="mDel_wrap">
		<h2 class="mDel_title">회원탈퇴</h2>
		<form method="post" action="member_del_ok.do"
			onsubmit="return del_check();">
			<table id="mDel_t">
				<tr>
					<th>회원아이디</th>
					<td>${id}</td>
				</tr>
				<tr>
					<th>회원이름</th>
					<td>${dm.mem_name}</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input type="password" name="del_pwd" id="del_pwd"
						size="14" /></td>
				</tr>
				<tr>
					<th>탈퇴사유</th>
					<td><textarea name="del_cont" id="del_cont" rows="9" cols="36"></textarea></td>
				</tr>
			</table>
			<div id="mDel_menu">
				<input type="submit" value="탈퇴" /> <input type="reset" value="취소"
					onclick="$('#del_pwd').focus();" />
			</div>
		</form>
	</div>
</body>
</html>