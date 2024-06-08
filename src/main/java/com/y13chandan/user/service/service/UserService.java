package com.y13chandan.user.service.service;

import com.y13chandan.user.service.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User> getAllUser();
    User getUser(String userId);
}
