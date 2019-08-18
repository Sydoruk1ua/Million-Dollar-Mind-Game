package com.sydoruk.mdmg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name = "messages")
public class Message {
    @Column(name = "user_email")
    private final String userEmail;
    @Column(name = "message")
    private final String value;
    @Id
    private Integer id;
}
