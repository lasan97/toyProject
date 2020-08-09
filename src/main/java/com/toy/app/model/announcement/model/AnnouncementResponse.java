package com.toy.app.model.announcement.model;

import com.toy.app.model.announcement.Announcement;
import lombok.Data;

import java.util.Date;

@Data
public class AnnouncementResponse {
    private Long idx;

    private Date createDt;

    private Date updateDt;

    private String name; // 공고 제목

    private String company; // 회사

    private Announcement.RecruitType recruitType; // 계약형태

    private Date dueDate; // 종료일

    private String location; // 위치 ex) 판교

    private Announcement.Sectors sectors;

    private String keyword;

    private String content; // 내용

    private Date reservationDt;

}
