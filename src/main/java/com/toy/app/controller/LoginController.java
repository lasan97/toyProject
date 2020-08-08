package com.toy.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.toy.app.model.account.UserAccount;
import com.toy.app.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
    @GetMapping("/signin")
    public String getLoginPage(){
        return "/login/signin";
    }
    
    @GetMapping("/signup")
    public String getSignupPage(){
        return "/login/signup";
    }

    @PostMapping("/signup")
    public ResponseEntity<Boolean> signup(
            @RequestBody UserAccount request
            ){
        return ResponseEntity.ok(loginService.signUp(request));
    }
    
    @PostMapping("/signin")
    public ResponseEntity<Boolean> signin(
            @RequestBody UserAccount request
            ){
        return ResponseEntity.ok(loginService.signinUser(request));
    }
    
    @GetMapping("/test2")
    public String signin2(){
        return "/boot_template/index";
    }
    
}
