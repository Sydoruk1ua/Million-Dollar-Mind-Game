package com.sydoruk.mdmg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "messages")
public class Message {
    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_email")
    private final String userEmail;
    @Column(name = "message")
    private final String value;
    @Id
    private Integer id;
}
