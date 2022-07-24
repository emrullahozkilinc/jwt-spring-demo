package com.emr.jwtspringdemo.service;

import com.emr.jwtspringdemo.domain.Role;
import com.emr.jwtspringdemo.domain.User;
import com.emr.jwtspringdemo.repo.RoleRepository;
import com.emr.jwtspringdemo.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class IUserService implements UserService {

    final UserRepository userRepository;
    final RoleRepository roleRepository;

    @Override
    public User saveUser(User user) {
        log.info("Saving user: {}", user);
        return userRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving role: {}", role);
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Getting user: {}", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        log.info("Getting all users");
        return userRepository.findAll();
    }
}

