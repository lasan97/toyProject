package com.toy.app.model.resume;

import com.toy.app.model.account.UserAccount;
import com.toy.app.model.announcement.Announcement;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_resume")
public class Resume {

    @Id
    @GeneratedValue
    private Long resumeId;

    @CreationTimestamp
    private Date createDt;

    @UpdateTimestamp
    private Date updateDt;

    @ManyToOne
    private UserAccount userAccount;

    // Career join
    @OneToMany(mappedBy = "resume")
    private List<Career> careers;

    // Projects join
    @OneToMany(mappedBy = "resume")
    private List<Project> projects;

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
