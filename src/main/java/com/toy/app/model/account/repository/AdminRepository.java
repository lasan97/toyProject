package com.toy.app.model.account.repository;

import com.toy.app.model.account.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminAccount,Long> {


}
