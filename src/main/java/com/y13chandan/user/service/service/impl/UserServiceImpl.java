package com.y13chandan.user.service.service.impl;

import com.y13chandan.user.service.entities.User;
import com.y13chandan.user.service.exception.ResourceNotFoundException;
import com.y13chandan.user.service.repository.UserRepository;
import com.y13chandan.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("USer with given id is not available!! : " + userId));
    }
}
