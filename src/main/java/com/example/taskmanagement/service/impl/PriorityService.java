package com.example.taskmanagement.service.impl;

import com.example.taskmanagement.entity.Priority;
import com.example.taskmanagement.repository.PriorityRepository;
import com.example.taskmanagement.service.IPriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PriorityService implements IPriorityService {
    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public List<Priority> findAll() {
        return priorityRepository.findAll();
    }

    @Override
    public Optional<Priority> findById(Long id) {
        return priorityRepository.findById(id);
    }

    @Override
    public Priority save(Priority priority) {
        return priorityRepository.save(priority);
    }

    @Override
    public void deleteById(Long id) {
        priorityRepository.deleteById(id);
    }
}
