package com.sydoruk.mdmg.service;

import com.sydoruk.mdmg.model.Message;

import java.util.List;

public interface MessageService {
    Message save(Message message);

    List<Message> findAll();
}
