package com.sydoruk.mdmg.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    private Integer id;
    @Column(nullable = false, length = 45, unique = true)

    private String email;
    @Column(nullable = false, length = 45)
    private String password;
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
