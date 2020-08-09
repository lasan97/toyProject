<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<title>Sign Up</title>

<!-- Bootstrap core CSS -->
<link href="boot_template/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Custom styles for this template -->
<link href="boot_template/css/modern-business.css" rel="stylesheet">

<!-- Bootstrap core JavaScript -->
<script src="boot_template/vendor/jquery/jquery.min.js"></script>
<script src="boot_template/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<script src="js/login.js"></script>
</head>

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
			<div id="form" style="width:500px;
    margin-left:35%;
    margin-right:35%;
    background:white;
    height: 850px;">
    			<div id="formIn" style="margin:0px 20px 20px 20px;">
					<form id="frmSignup">
						<div style=""><h2>지원자 등록</h2></div>
							<ul id="registInfo" style="margin-top:20px;">
								<li>카카오 입사 지원은 1인당 1개의 이메일계정을 이용할 수 있습니다.</li>
								<li>동일인이 여러 이메일을 이용하여 지원하는 경우 불이익이 있을 수 있습니다.</li>
								<li>7일내에 이메일 인증을 하지 않는 경우, 해당 계정은 자동으로 삭제 됩니다.</li>
							</ul>
						<div class="loginField" style=""><h4>이메일</h4>
							<h5>입력한 메일로 인증 메일을 발송합니다.</h5>
						</div>
						<div class="loginField" style="width:100%" >
							<input type="email" name="email" placeholder="Username" required style="width:100%">
						</div>
						
						<div class="loginField" style="">비밀번호</div>
						<div class="loginField">
							<input type="password" name="password" placeholder="Password"
								required style="width:100%">
						</div>
						<div class="loginField" style="">비밀번호 확인</div>
						<div class="loginField">
							<input type="password" name="password_re" placeholder="Password"
								required style="width:100%">
						</div>
						
						<div class="loginField" style="">이름</div>
						<div class="loginField">
							<input type="text" name="name" placeholder="이름"
								required style="width:100%">
						</div>
						
						<div class="loginField" style="">생년월일</div>
						<div class="loginField">
							<input type="text" name="birthday" placeholder="YYYY-MM-DD"
								required style="width:100%">
						</div>
						
						<div class="loginField" style="">휴대폰 번호</div>
						<div class="loginField">
							<input type="text" id="phoneNumber" name="hp" placeholder="010-0000-0000"
								required style="width:100%">
						</div>
						<div class="loginField">
						</div>
						
					</form>
				</div>
			</div>
			
			<div id="loginBtnWrapper" style="width:500px;
    margin-left:35%;
    margin-right:35%;
    background:white;">
    <input type="button" value="등록완료"
							onclick="ajaxSignUp();" style="width:100%;background:#ffdc00;height:70px">
			</div>		
					
		</div>
	</div>

	<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />

</body>

</html>