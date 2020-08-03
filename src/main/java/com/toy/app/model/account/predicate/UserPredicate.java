package com.toy.app.model.account.predicate;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.toy.app.model.account.QUserAccount;

public class UserPredicate {
    public static Predicate searchByUserEmail(){
        BooleanBuilder builder = new BooleanBuilder();
        QUserAccount userAccount = QUserAccount.userAccount;
        builder.and(userAccount.email.eq("email"));
        return builder;
    }
}
