package com.emr.jwtspringdemo.repo;

import com.emr.jwtspringdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}