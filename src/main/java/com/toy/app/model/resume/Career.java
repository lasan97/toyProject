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
@Table(name = "career")
public class Career {
    @Id
    private Long idx;

    private String company; // 회사

    private String startWork; // 입사일

    private String endWork; // 퇴사일

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('TEMPORARY','PERMANENT','CONTRACT')")
    private Announcement.RecruitType recruitType; // 직원 유형

    private String rank; // 직급

    private String task; // 담당 업무
}
