package com.toy.app.model.resume;

import com.toy.app.model.announcement.Announcement;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "resume")
public class Resume {

    @Id
    private Long idx;

    // Career join

    // Projects join

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('TEMPORARY','PERMANENT','CONTRACT','NONE')")
    private ArmyInfo armyInfo; // 병역 정보

    private String aboutMe; // 자기소개

    // PDF 포트폴리오

    // 추천인?


    public enum ArmyInfo {
        TEMPORARY, // 비정규직
        PERMANENT, // 정규직
        CONTRACT,    // 계약직
        NONE, // 해당없음
    }



}
