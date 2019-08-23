package com.sydoruk.mdmg.service;

import com.sydoruk.mdmg.model.User;

import java.util.List;

public interface UserService {
    User findByUsername(String username);

    List<User> findAll();

    User save(User user);

    User getFromAuthentication();
}
