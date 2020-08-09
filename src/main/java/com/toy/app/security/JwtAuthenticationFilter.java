package com.toy.app.security;

import java.io.IOException;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.toy.app.model.account.UserAccount;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JwtAuthenticationFilter {
//	public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

//    private final AuthenticationManager authenticationManager;
//
//
//    /* Trigger when we issue POST request to /login
//    We also need to pass in {"username":"minho", "password":"minho123"} in the request body
//    * */
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
//
//        // Grab credentials and map then to LoginViewModel
//        UserAccount credentials = null;
//        try {
//            credentials = new ObjectMapper().readValue(request.getInputStream(), UserAccount.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Create login token
//        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
//                credentials.getName(),
//                credentials.getPassword(),
//                new ArrayList<>()
//        );
//
//        // Authenticate user
//        Authentication auth = authenticationManager.authenticate(authenticationToken);
//        return auth;
//    }
//
//
//    @Override
//    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
//        // Grab principal
//        UserPrincipal principal = (UserPrincipal) authResult.getPrincipal();
//
//        // Create JWT Token
//        String token = JWT.create()
//                .withSubject(principal.getUsername())
//                .withExpiresAt(new Date(System.currentTimeMillis() + JwtProperties.EXPIRATION_TIME))
//                .sign(Algorithm.HMAC512(JwtProperties.SECRET.getBytes()));
//
//        // Add token in response
//        response.addHeader(JwtProperties.HEADER_STRING, JwtProperties.TOKEN_PREFIX + token);
//    }
}