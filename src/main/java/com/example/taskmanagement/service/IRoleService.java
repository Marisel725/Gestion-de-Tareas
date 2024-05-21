package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.Role;

import java.util.List;
import java.util.Optional;

public interface IRoleService {
    List<Role> findAll();

    Optional<Role> findById(Long id);

    Role save(Role role);

    void deleteById(Long id);
}
