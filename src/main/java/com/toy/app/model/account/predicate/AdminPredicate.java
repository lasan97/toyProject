package com.toy.app.model.account.predicate;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.toy.app.model.account.QAdminAccount;

public class AdminPredicate {
    public static Predicate searchResume(){
        BooleanBuilder builder = new BooleanBuilder();
        QAdminAccount adminAccount = QAdminAccount.adminAccount;
        builder.and(adminAccount.loginId.eq("loginId"));
        return builder;
    }
}
