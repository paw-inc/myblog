package com.pawinc.myblog.service.impl;

import com.pawinc.myblog.model.User;
import com.pawinc.myblog.repository.UserRepository;
import com.pawinc.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
