<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메인화면</title>
<script type="text/javascript">
    // ${msg}는 RedirectAttributes에 담긴 값을 가져옵니다.
    var message = "${msg}"; 
    
    // 2. 메시지가 존재할 때만 alert창을 띄웁니다.
    if (message != "" && message != null) {
        alert(message);
    }
</script>
<link rel="stylesheet" type="text/css" href="./css/admin.css" />
</head>
<body>
	<div id="aMain_wrap">
		<%--관리자 메인 상단 --%>
		<div id="aMain_header">
			<%--관리자 로고 --%>
			<div id="aMain_logo">
				<a href="admin_index.do"> <img
					src="./images/admin/admin_logo.png" />
				</a>
			</div>
			<%--관리자 상단메뉴 --%>
			<div id="aMain_menu">
				<ul>
					<li><a href="admin_gongji_list.do">공지사항</a></li>
					<li><a href="admin_board_list.do">게시판</a></li>
					<li><a href="admin_bbs_list.do">자료실</a></li>
					<li><a href="admin_member_list.do">회원관리</a></li>
				</ul>
			</div>
			<%--관리자 메인 우측메뉴 --%>
			<div id="aMain_right">
				<form method="post" action="admin_logout.do">
					<h3 class="aRight_title">
						${admin_name}님 로그인을 환영합니다. <input type="submit" value="로그아웃" />
					</h3>
				</form>
			</div>
		</div>

		<div class="clear"></div>

		<%--관리자 메인 본문 --%>
		<div id="aMain_cont">
			<h2 class="aMainCont_title">관리자 메인 화면입니다.</h2>
		</div>

		<div class="clear"></div>

		<%--관리자 메인 하단 --%>
		<div id="aMain_footer">
			<h2 class="aMainFooter_title">대전 중구 계룡로 846 4층 405호	TEL)042-0000-0000</h2>
		</div>
	</div>
</body>
</html>
