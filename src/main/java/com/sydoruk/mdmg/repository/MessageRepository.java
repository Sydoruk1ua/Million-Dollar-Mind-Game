package com.sydoruk.mdmg.repository;

import com.sydoruk.mdmg.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
