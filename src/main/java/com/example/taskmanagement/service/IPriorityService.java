package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.Priority;

import java.util.List;
import java.util.Optional;

public interface IPriorityService {
    List<Priority> findAll();

    Optional<Priority> findById(Long id);

    Priority save(Priority priority);

    void deleteById(Long id);
}
