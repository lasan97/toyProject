<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Sign In</title>

  <!-- Bootstrap core CSS -->
	<link href="boot_template/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="boot_template/css/modern-business.css" rel="stylesheet">
	
  <!-- Bootstrap core JavaScript -->
  <script src="boot_template/vendor/jquery/jquery.min.js"></script>
  <script src="boot_template/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>

<script>
	function ajaxSignIn(){
		
		var formObj = $("#frmSignin");
		var data = Object.fromEntries(formObj);
		$.ajax({
		    type       : "POST",
		    contentType: 'application/json',
		    data : JSON.stringify(data),
		    dataType   : 'json',
		    url        : '/signin',
		    error      : function(json){
		        alert('저장중 오류가 발생하였습니다');
		    },
		    success    : function(data){
		    	if(data == false){
		    		alert("로그인 실패");
		    		return;
		    	}
		    	
		    }
		});
	}

</script>

<body>

<jsp:include page="/WEB-INF/jsp/common/header.jsp" />
	
	<div id="content" class="container" style="margin-top:100px;margin-bottom:100px; ">
		<form action="/signin" method="POST" id="frmSignin">
			<div>
				로그인
			</div>
		    <div class="row">
		        <input type="text" name="email" placeholder="Username" required>
		        <input type="password" name="password" placeholder="Password" required>
		        <input type="button" value="Login" onclick="ajaxSignIn();">
	      	</div>
	  </form>
	  
	  <div id="findPasswordArea">
	  	비밀번호를 잊어버렸나요? 비밀번호 찾기
	  </div>
	  <div id="signup">
		처음 지원하시는 분들은 지원자 등록을 먼저 해주세요. <a href="/signup">신규지원자 등록</a>	  
		</div>
	</div>
	
<jsp:include page="/WEB-INF/jsp/common/footer.jsp" />	
	
</body>

</html>