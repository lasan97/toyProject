package com.toy.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.toy.app.exception.CustomException;
import com.toy.app.model.account.UserAccount;
import com.toy.app.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
    @GetMapping("/signin")
    public String getLoginPage(){
        return "login/signin";
    }
    
    @GetMapping("/signup")
    public String getSignupPage(){
        return "login/signup";
    }

    @PostMapping("/signup")
    public ResponseEntity<Boolean> signup(
            @RequestBody UserAccount request
            ) throws CustomException{
        return ResponseEntity.ok(loginService.signUp(request));
    }
    
    @PostMapping("/signin/auth")
    public ResponseEntity<Boolean> signinAuth(
            @RequestBody UserAccount request
            ) throws CustomException{
    			
        return ResponseEntity.ok(loginService.signinUser(request));
    }
    
}
