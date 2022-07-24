package com.emr.jwtspringdemo.service;

import com.emr.jwtspringdemo.domain.Role;
import com.emr.jwtspringdemo.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getAllUsers();
}
