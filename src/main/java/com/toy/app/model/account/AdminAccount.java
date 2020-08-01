package com.toy.app.model.account;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "admin")
public class AdminAccount {
    @Id
    private Long idx;
    private String loginId;
    private String password;
}
