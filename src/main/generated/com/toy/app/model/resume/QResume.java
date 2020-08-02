package com.toy.app.model.resume;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QResume is a Querydsl query type for Resume
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResume extends EntityPathBase<Resume> {

    private static final long serialVersionUID = -1547878305L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QResume resume = new QResume("resume");

    public final StringPath aboutMe = createString("aboutMe");

    public final EnumPath<Resume.ArmyInfo> armyInfo = createEnum("armyInfo", Resume.ArmyInfo.class);

    public final ListPath<Career, QCareer> careers = this.<Career, QCareer>createList("careers", Career.class, QCareer.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> createDt = createDateTime("createDt", java.util.Date.class);

    public final ListPath<Project, QProject> projects = this.<Project, QProject>createList("projects", Project.class, QProject.class, PathInits.DIRECT2);

    public final NumberPath<Long> resumeId = createNumber("resumeId", Long.class);

    public final DateTimePath<java.util.Date> updateDt = createDateTime("updateDt", java.util.Date.class);

    public final com.toy.app.model.account.QUserAccount userAccount;

    public QResume(String variable) {
        this(Resume.class, forVariable(variable), INITS);
    }

    public QResume(Path<? extends Resume> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QResume(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QResume(PathMetadata metadata, PathInits inits) {
        this(Resume.class, metadata, inits);
    }

    public QResume(Class<? extends Resume> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userAccount = inits.isInitialized("userAccount") ? new com.toy.app.model.account.QUserAccount(forProperty("userAccount"), inits.get("userAccount")) : null;
    }

}

