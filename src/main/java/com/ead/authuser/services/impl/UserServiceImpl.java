package com.ead.authuser.services.impl;

import com.ead.authuser.repositories.UserRepository;
import com.ead.authuser.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
}
