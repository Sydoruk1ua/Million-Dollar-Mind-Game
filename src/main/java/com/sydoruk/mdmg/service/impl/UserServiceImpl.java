package com.sydoruk.mdmg.service.impl;

import com.sydoruk.mdmg.model.User;
import com.sydoruk.mdmg.repository.UserRepository;
import com.sydoruk.mdmg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
