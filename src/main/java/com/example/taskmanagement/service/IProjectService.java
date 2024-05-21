package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.Project;

import java.util.List;
import java.util.Optional;

public interface IProjectService {
    List<Project> findAll();

    Optional<Project> findById(Long id);

    Project save(Project project);

    void deleteById(Long id);
}
