package com.toy.app.model.resume;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QResume is a Querydsl query type for Resume
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QResume extends EntityPathBase<Resume> {

    private static final long serialVersionUID = -1547878305L;

    public static final QResume resume = new QResume("resume");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public QResume(String variable) {
        super(Resume.class, forVariable(variable));
    }

    public QResume(Path<? extends Resume> path) {
        super(path.getType(), path.getMetadata());
    }

    public QResume(PathMetadata metadata) {
        super(Resume.class, metadata);
    }

}

