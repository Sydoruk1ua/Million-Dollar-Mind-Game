package com.sydoruk.mdmg.model;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private final Integer id;
    @Column(nullable = false, length = 45)
    private final String email;
    @Column(nullable = false, length = 45)
    private final String password;
    @Column(name = "first_name", nullable = false, length = 45)
    private final String firstName;
    @Column(name = "last_name", nullable = false, length = 45)
    private final String lastName;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private final Role role;
}
