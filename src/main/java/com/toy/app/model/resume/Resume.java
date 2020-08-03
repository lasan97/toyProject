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
    @Column(columnDefinition = "enum('SERVED_SOLDIER','SERVED_OFFICER','SERVED_SERGEANT'"
    		+ ",'SERVED_PUBLIC_SERVICE' ,'SERVED_INDUSTRY' , 'SERVED_PROFESSIONAL_RESEARCH' ,'SERVING_PROFESSIONAL_RESEARCH'"
    		+ ",'EXEMPTION','WILL_SERVE', 'NONE')")
    private ArmyInfo armyInfo; // 병역 정보

    private String aboutMe; // 자기소개

    // PDF 포트폴리오

    // 추천인?

    public enum ArmyInfo {
        SERVED_SOLDIER, 					// 병역필_현역(병)
        SERVED_OFFICER, 					// 병역필_현역(장교)
        SERVED_SERGEANT,    				// 병역필_현역(부사관)
        SERVED_PUBLIC_SERVICE,    			// 병역필_공익근무요원
        SERVED_INDUSTRY,    				// 병역필_산업기능요원
        SERVED_PROFESSIONAL_RESEARCH,    	// 병역필_전문연구요원
        SERVING_PROFESSIONAL_RESEARCH,    	// 복무중(전직가능)_전문연구요원
        EXEMPTION,    						// 병역면제
        WILL_SERVE,    						// 미필
        NONE, 								// 해당없음
    }



}
