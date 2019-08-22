package com.sydoruk.mdmg.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    private Integer id;
    @Column(nullable = false, length = 20)
    private String type;
}
