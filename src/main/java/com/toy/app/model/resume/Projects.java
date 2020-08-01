package com.toy.app.model.resume;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projects")
public class Projects {

    @Id
    private Long idx;

    private String name; // 프로젝트 명

    private String company; // 회사 명

    private String startDt; // 시작일

    private String endDt; //종료일

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('INHOUSE','OUTSOURCING','FREELANCER','ETC')")
    private ProjectType recruitType; // 프로젝트 형태

    private String Technology ; // 사용 기술

    private String text; // 상세

    public enum ProjectType {
        INHOUSE, // 사내프로젝트
        OUTSOURCING, // 외주
        FREELANCER,    // 프리랜서
        ETC, // 기타
    }
}
