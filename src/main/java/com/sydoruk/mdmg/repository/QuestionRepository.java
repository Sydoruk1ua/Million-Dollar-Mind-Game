package com.sydoruk.mdmg.repository;

import com.sydoruk.mdmg.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
