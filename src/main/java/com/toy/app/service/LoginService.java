package com.toy.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;
import com.toy.app.model.account.UserAccount;
import com.toy.app.model.account.predicate.UserPredicate;
import com.toy.app.model.account.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
    UserRepository userRepository;

    public Boolean signUp(UserAccount request) {
        userRepository.save(request);
        return true;
    }
    
    public boolean signinUser(UserAccount user) {
    	
    	if(userRepository.findByEmailAndPassword(user.getEmail() , user.getPassword()) != null) {
    		return true;
    	}
		return false;
		
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

	
}
