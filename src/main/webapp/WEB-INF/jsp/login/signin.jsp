<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="description" content="">
<meta name="author" content="">

<title>Sign In</title>

<!-- Bootstrap core CSS -->
<link href="boot_template/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="boot_template/css/modern-business.css" rel="stylesheet">

<!-- Bootstrap core JavaScript -->
<script src="boot_template/vendor/jquery/jquery.min.js"></script>
<script src="boot_template/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>
<script src="js/login.js"></script>

<style>
	.loginField{
		margin-top:20px;
	}
</style>

<body>

	<jsp:include page="/WEB-INF/jsp/common/header.jsp" />

	<div id="content" 
	class="container22">
		<div id="formWrapper" style="width:100%;height:100%;background:#D0D0D0;">
			<div id="form" style="width:300px;
    height:300px;
    width:500px;
    margin-left:35%;
    margin-right:35%;
    background:white;
    height: 400px;">
    <input type="hidden" value="11" id="token">
    			<div id="formIn" style="margin:0px 20px 20px 20px;">
					<form action="/signin/auth" method="POST" id="frmSignin">
						<div style=""><h2>로그인</h2></div>
						<div class="loginField" style="">이메일</div>
						<div class="loginField" style="width:100%">
							<input type="text" name="email" placeholder="Username" required style="width:100%">
						</div>
						<div class="loginField" style="width:100%">
							<input type="text" name="username" placeholder="Username" required style="width:100%">
						</div>
						
						<div class="loginField" style="">비밀번호</div>
						<div class="loginField">
							<input type="password" name="password" placeholder="Password"
								required style="width:100%">
						</div>
						<div class="loginField">
						</div>
						
<!-- 						<button type="submit">Login</button> -->
					</form>
	
					<div id="findPasswordArea" class="loginField">
						* 비밀번호를 잊어버렸나요? <a href="findpaswrod">비밀번호 찾기</a>
						</div>
					<div id="signup" class="loginField">
						* 처음 지원하시는 분들은 지원자 등록을 먼저 해주세요. <a href="/signup">신규지원자 등록</a>
					</div>
				</div>
			</div>
			
			<div id="loginBtnWrapper" style="width:500px;
    margin-left:35%;
    margin-right:35%;
    background:white;">
    <input type="button" value="Login"
							onclick="ajaxSignIn();" style="width:100%;background:#ffdc00;height:70px">
			</div>		
					
		</div>
	</div>

	<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />

</body>

</html>