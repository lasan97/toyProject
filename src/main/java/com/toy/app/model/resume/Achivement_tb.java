package com.toy.app.model.resume;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.toy.app.model.announcement.Announcement;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_achivement")
public class Achivement_tb {
    @Id
    @GeneratedValue
    private Long achivementId;

    private String type; // 유형 ex) 고졸,대학... or  자격증,수상경력

    private String name; // 자격증명 or 학교명

    private String major; // 전공

    private String score; // 학점  or 점수/급

    private Date startDt; // 입학  or 취득일

    private Date endDt;   // 졸업

    private String result; // 졸업 상태

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('EDUCATION','CERTIFICATE','LANGUAGE')")
    private InfoType infoType; // 유형

    private String role; // 직급

    private String position; // 담당 업무

    @ManyToOne
    @JsonIgnore
    private Resume resume;

    public enum InfoType {
        EDUCATION,      // 학력
        CERTIFICATE,    // 자격증
        LANGUAGE,       // 어학
    }

}
