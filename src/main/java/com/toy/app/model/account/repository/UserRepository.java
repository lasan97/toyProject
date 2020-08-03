package com.toy.app.model.account.repository;

import com.toy.app.model.account.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface UserRepository extends JpaRepository<UserAccount,Long>, QuerydslPredicateExecutor {
    UserAccount findByEmail(String email);

}
