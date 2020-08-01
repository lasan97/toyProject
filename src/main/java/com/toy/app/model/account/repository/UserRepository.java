package com.toy.app.model.account.repository;

import com.toy.app.model.account.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount,Long> {


}
