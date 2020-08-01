package com.toy.app.model.account;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
@Getter
@Setter
public class UserAccount {

    @Id
    private Long idx;

    private String email;

    private String name;

    private String password;

    private Date birthday;

    private String hp;

}
