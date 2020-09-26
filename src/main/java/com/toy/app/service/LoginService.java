package com.toy.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;
import com.toy.app.exception.CustomException;
import com.toy.app.model.account.UserAccount;
import com.toy.app.model.account.predicate.UserPredicate;
import com.toy.app.model.account.repository.UserRepository;


@Service
public class LoginService implements UserDetailsService {

	@Autowired
    UserRepository userRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;

    public Boolean signUp(UserAccount request) throws CustomException {
    	if(userRepository.findTop1ByEmailOrderByEmail(request.getEmail()) != null) {
    		throw new CustomException("이미 회원가입 한 email입니다.", "...");
    	}
    	
    	//암호화
    	request.setPassword(passwordEncoder.encode(request.getPassword()));
        userRepository.save(request);
        return true;
    }
    
    public boolean signinUser(UserAccount user) throws CustomException {
    	
    	UserAccount userInDB = userRepository.findByEmail(user.getEmail());
    	if(userInDB == null) {
    		throw new CustomException("로그인 실패.(유저가 없습니다.) ", "...");
    	}
    		
    	if(!passwordEncoder.matches(user.getPassword() , userInDB.getPassword())){
          throw new CustomException("로그인 실패. ", "...");
    	}
		
    	return true;
	}

    public List<UserAccount> selectUser() {
        Predicate predicate = UserPredicate.searchByUserEmail();
        return (List<UserAccount>) userRepository.findAll(predicate);
    }
    
    public int createRandomUser() {
    	UserAccount user = new UserAccount();
    	user.setEmail("test@gmail.com");
    	user.setName("테스트");
    	user.setPassword("password...");

    	userRepository.save(user);
    	return 1;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserAccount userAccount = userRepository.findByEmail(username);
        return userAccount;
	}

	
}
