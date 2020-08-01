package com.toy.app.model.announcement;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnnouncement is a Querydsl query type for Announcement
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnnouncement extends EntityPathBase<Announcement> {

    private static final long serialVersionUID = 540021855L;

    public static final QAnnouncement announcement = new QAnnouncement("announcement");

    public final StringPath company = createString("company");

    public final DateTimePath<java.util.Date> dueDate = createDateTime("dueDate", java.util.Date.class);

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final StringPath location = createString("location");

    public final StringPath name = createString("name");

    public final EnumPath<Announcement.RecruitType> recruitType = createEnum("recruitType", Announcement.RecruitType.class);

    public final EnumPath<Announcement.Sectors> sectors = createEnum("sectors", Announcement.Sectors.class);

    public QAnnouncement(String variable) {
        super(Announcement.class, forVariable(variable));
    }

    public QAnnouncement(Path<? extends Announcement> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnnouncement(PathMetadata metadata) {
        super(Announcement.class, metadata);
    }

}

