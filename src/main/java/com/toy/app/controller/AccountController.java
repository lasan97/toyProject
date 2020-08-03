package com.toy.app.controller;

import com.toy.app.model.account.UserAccount;
import com.toy.app.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AccountController {

    private AccountService accountService;
    @GetMapping("/1")
    public String hello(){
        return "index";
    }

    @PostMapping("/sginup")
    public ResponseEntity<Boolean> signup(
            @RequestBody UserAccount request
            ){
        return ResponseEntity.ok(accountService.userSginUp(request));
    }

    @GetMapping("/select")
    public ResponseEntity<List<UserAccount>> selectUser(){
        return ResponseEntity.ok(accountService.selectUser());
    }
}
