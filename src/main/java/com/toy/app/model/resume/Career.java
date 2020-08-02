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
@Table(name = "tb_career")
public class Career {
    @Id
    @GeneratedValue
    private Long careerId;

    private String company; // 회사

    private Date startDt; // 입사일

    private Date endDt; // 퇴사일

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('TEMPORARY','PERMANENT','CONTRACT')")
    private Announcement.RecruitType recruitType; // 직원 유형

    private String role; // 직급

    private String position; // 담당 업무

    @ManyToOne
    @JsonIgnore
    private Resume resume;

}
