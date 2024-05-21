package com.example.taskmanagement.service.impl;

import com.example.taskmanagement.entity.Status;
import com.example.taskmanagement.repository.StatusRepository;
import com.example.taskmanagement.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService implements IStatusService {
    @Autowired
    private StatusRepository statusRepository;

    @Override
    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public Optional<Status> findById(Long id) {
        return statusRepository.findById(id);
    }

    @Override
    public Status save(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public void deleteById(Long id) {
        statusRepository.deleteById(id);
    }
}
