package com.toy.app.model.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.toy.app.model.announcement.Announcement;
import com.toy.app.model.resume.Project;
import com.toy.app.model.resume.Resume;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user")
@Getter
@Setter
public class UserAccount {

    @Id
    @GeneratedValue
    private Long idx;

    private String email;

    private String name;

    private String password;

    private Date birthday;

    private String hp;

    @ManyToOne
    @JsonIgnore
    private Announcement Applying;

    @CreationTimestamp
    private Date createDt;

    @UpdateTimestamp
    private Date updateDt;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('ADMIN','USER') default 'USER'")
    private Role role; // 권한

    public enum Role {
        ADMIN,
        USER,
    }

}
