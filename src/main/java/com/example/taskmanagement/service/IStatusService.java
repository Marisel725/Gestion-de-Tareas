package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.Status;

import java.util.List;
import java.util.Optional;

public interface IStatusService {
    List<Status> findAll();

    Optional<Status> findById(Long id);

    Status save(Status status);

    void deleteById(Long id);
}
