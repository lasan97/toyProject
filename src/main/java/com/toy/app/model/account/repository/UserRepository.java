package com.toy.app.model.account.repository;

import com.toy.app.model.account.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserAccount,Long>, QuerydslPredicateExecutor {
    UserAccount findByEmail(String email);

	UserAccount findByName(String name);

	UserAccount findByEmailAndPassword(String email, String password);

	UserAccount findFistByEmail(String email);

	UserAccount findTop1ByEmailOrderByEmail(String email);

	UserAccount findTop1ByEmailAndPasswordOrderByEmail(String email, String password);

}
