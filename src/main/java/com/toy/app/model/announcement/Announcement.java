package com.toy.app.model.announcement;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_announcement")
public class Announcement {

    @Id
    private Long idx;

    @CreationTimestamp
    private Date createDt;

    @UpdateTimestamp
    private Date updateDt;

    private String name; // 공고 제목

    private String company; // 회사

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('TEMPORARY','PERMANENT','CONTRACT')")
    private RecruitType recruitType; // 계약형태

    private Date dueDate; // 종료일

    private String location; // 위치 ex) 판교

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('TECH','SERVICE','STAFF','DESIGN')")
    private Sectors sectors;

    private String keyword;

    private String content; // 내용

    private Date reservationDt;

    public enum RecruitType {
        TEMPORARY, // 비정규직
        PERMANENT, // 정규직
        CONTRACT,    // 계약직
    }

    public enum Sectors {
        TECH, // 테크
        SERVICE, // 서비스
        STAFF,    // 스태프
        DESIGN, // 디자인
    }


}
