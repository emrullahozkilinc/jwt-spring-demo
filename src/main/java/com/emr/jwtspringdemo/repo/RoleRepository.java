package com.emr.jwtspringdemo.repo;

import com.emr.jwtspringdemo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}