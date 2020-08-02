package com.toy.app.model.resume;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCareer is a Querydsl query type for Career
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCareer extends EntityPathBase<Career> {

    private static final long serialVersionUID = -1981055056L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCareer career = new QCareer("career");

    public final NumberPath<Long> careerId = createNumber("careerId", Long.class);

    public final StringPath company = createString("company");

    public final DateTimePath<java.util.Date> endDt = createDateTime("endDt", java.util.Date.class);

    public final StringPath position = createString("position");

    public final EnumPath<com.toy.app.model.announcement.Announcement.RecruitType> recruitType = createEnum("recruitType", com.toy.app.model.announcement.Announcement.RecruitType.class);

    public final QResume resume;

    public final StringPath role = createString("role");

    public final DateTimePath<java.util.Date> startDt = createDateTime("startDt", java.util.Date.class);

    public QCareer(String variable) {
        this(Career.class, forVariable(variable), INITS);
    }

    public QCareer(Path<? extends Career> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCareer(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCareer(PathMetadata metadata, PathInits inits) {
        this(Career.class, metadata, inits);
    }

    public QCareer(Class<? extends Career> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.resume = inits.isInitialized("resume") ? new QResume(forProperty("resume"), inits.get("resume")) : null;
    }

}

