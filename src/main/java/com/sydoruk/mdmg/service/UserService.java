package com.sydoruk.mdmg.service;

import com.sydoruk.mdmg.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findByUsername(String username);

    List<User> findAll();

    User save(User user);
}
