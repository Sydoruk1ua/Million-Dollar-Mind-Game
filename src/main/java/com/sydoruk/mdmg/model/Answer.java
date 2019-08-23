package com.sydoruk.mdmg.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "answers")
public class Answer {
    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "question_id", referencedColumnName = "id")
    private Question question;
    @Column(name = "answer_en")
    private String answerEn;
    @Column(name = "answer_ru")
    private String answerRu;
    @Column(name = "is_correct")
    private String isCorrect;
}
