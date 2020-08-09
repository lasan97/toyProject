
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
			success : function(data) {
				if (data.status == "400") {
					alert(data.msg);
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
		url : '/signin',
		error : function(json) {
			alert('error');
		},
		success : function(data) {
			if (data.status == "400") {
				alert(data.msg);
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