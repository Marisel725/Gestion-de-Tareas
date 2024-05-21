package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskService {
    List<Task> findAll();

    Optional<Task> findById(Long id);

    Task save(Task task);

    void deleteById(Long id);
}
