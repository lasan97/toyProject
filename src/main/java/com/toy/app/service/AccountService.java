package com.toy.app.service;

import com.querydsl.core.types.Predicate;
import com.toy.app.model.account.UserAccount;
import com.toy.app.model.account.predicate.UserPredicate;
import com.toy.app.model.account.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class AccountService {

    private UserRepository userRepository;

    public Boolean userSginUp(UserAccount request) {
        userRepository.save(request);
        return true;
    }

    public List<UserAccount> selectUser() {
        Predicate predicate = UserPredicate.searchByUserEmail();
        return (List<UserAccount>) userRepository.findAll(predicate);
    }
}
