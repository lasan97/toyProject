package com.toy.app.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.toy.app.model.account.UserAccount;

@Controller
public class HomeController {
	
    @GetMapping("/")
    public String index(Model model ,  @AuthenticationPrincipal UserAccount user){
    	if(user != null) {
    		model.addAttribute("name"  , user.getName());
    	}else {
    		model.addAttribute("name"  , "not login");
    	}
    	
        return "index";
    }
    
}
