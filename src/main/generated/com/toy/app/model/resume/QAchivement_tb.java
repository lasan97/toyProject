package com.toy.app.model.resume;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAchivement_tb is a Querydsl query type for Achivement_tb
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAchivement_tb extends EntityPathBase<Achivement_tb> {

    private static final long serialVersionUID = -1524919893L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAchivement_tb achivement_tb = new QAchivement_tb("achivement_tb");

    public final NumberPath<Long> achivementId = createNumber("achivementId", Long.class);

    public final DateTimePath<java.util.Date> endDt = createDateTime("endDt", java.util.Date.class);

    public final EnumPath<Achivement_tb.InfoType> infoType = createEnum("infoType", Achivement_tb.InfoType.class);

    public final StringPath major = createString("major");

    public final StringPath name = createString("name");

    public final StringPath position = createString("position");

    public final StringPath result = createString("result");

    public final QResume resume;

    public final StringPath role = createString("role");

    public final StringPath score = createString("score");

    public final DateTimePath<java.util.Date> startDt = createDateTime("startDt", java.util.Date.class);

    public final StringPath type = createString("type");

    public QAchivement_tb(String variable) {
        this(Achivement_tb.class, forVariable(variable), INITS);
    }

    public QAchivement_tb(Path<? extends Achivement_tb> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAchivement_tb(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAchivement_tb(PathMetadata metadata, PathInits inits) {
        this(Achivement_tb.class, metadata, inits);
    }

    public QAchivement_tb(Class<? extends Achivement_tb> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.resume = inits.isInitialized("resume") ? new QResume(forProperty("resume"), inits.get("resume")) : null;
    }

}

