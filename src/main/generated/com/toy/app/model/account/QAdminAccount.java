package com.toy.app.model.account;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAdminAccount is a Querydsl query type for AdminAccount
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAdminAccount extends EntityPathBase<AdminAccount> {

    private static final long serialVersionUID = 988981710L;

    public static final QAdminAccount adminAccount = new QAdminAccount("adminAccount");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath loginId = createString("loginId");

    public final StringPath password = createString("password");

    public QAdminAccount(String variable) {
        super(AdminAccount.class, forVariable(variable));
    }

    public QAdminAccount(Path<? extends AdminAccount> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdminAccount(PathMetadata metadata) {
        super(AdminAccount.class, metadata);
    }

}

