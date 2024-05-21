package com.example.taskmanagement.repository;

import com.example.taskmanagement.entity.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepository extends JpaRepository<Priority,Long> {
}
