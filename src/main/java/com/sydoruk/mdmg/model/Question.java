package com.sydoruk.mdmg.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "questions")
public class Question {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "type_id", referencedColumnName = "id")
    private QuestionType questionType;
    @Column(name = "question_en")
    private String questionEn;
    @Column(name = "question_ru")
    private String questionRu;
    @Column(name = "prompt_en")
    private String promptEn;
    @Column(name = "prompt_ru")
    private String promptRu;
}
