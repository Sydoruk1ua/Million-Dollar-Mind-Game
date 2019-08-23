package com.sydoruk.mdmg.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "question_types")
public class QuestionType {
    @Id
    private Integer id;

    private String type;
}
