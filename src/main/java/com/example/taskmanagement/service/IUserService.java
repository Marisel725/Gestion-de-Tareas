package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);
}
