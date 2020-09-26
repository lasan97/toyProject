
function ajaxSignUp() {

	var formObj = $("#frmSignup");
    var data = getFormData(formObj);
    
    if(data.password == null || ( data.password != data.password_re ) ){
    	alert("패스워드를 다시 확인하세요. ");
    	return;
    } 
    
    if(data.hp == null || data.hp == "" || isValidPhoneNum(data.hp) == false){
    	alert("휴대폰 번호를 다시 확인하세요. ");
    	return;
    }
    
		$.ajax({
			type : "POST",
			contentType : 'application/json',
			data : JSON.stringify(data),
			dataType : 'json',
			url : '/signup',
			error : function(json) {
				alert('error');
			},
			success : function(result) {
				if (result.status == "400") {
					alert(result.msg);
					return;
				}else{
					alert("회원가입 성공");
					window.location.href = "/signin";
				}

			}
		});
	}

function ajaxSignIn() {

	var formObj = $("#frmSignin");
    var data = getFormData(formObj);
	
	$.ajax({
		type : "POST",
		contentType : 'application/json',
		data : JSON.stringify(data),
		dataType : 'json',
		url : '/signin/auth',
		error : function(json) {
			alert('error');
		},	
		beforeSend : function(xhr)
		{
			//이거 안하면 403 error
			//데이터를 전송하기 전에 헤더에 csrf값을 설정한다
			var $token = $("#token");
//			xhr.setRequestHeader($token.data("token-name"), $token.val());
		},
		success : function(result) {
			if (result.status == "400") {
				alert(result.msg);
				return;
			}else{
				alert("로그인 성공");
				window.location.href = "/";
			}

		}
	});
}

function getFormData($form){
    var unindexed_array = $form.serializeArray();
    var indexed_array = {};

    $.map(unindexed_array, function(n, i){
        indexed_array[n['name']] = n['value'];
    });

    return indexed_array;
}


function isValidPhoneNum(ph){
	
	var pattern = /(^010)\-([0-9]{4})\-([0-9]{4})/;
	if(ph.match(pattern) == null){
		return false;
	}
	
	return true;
}