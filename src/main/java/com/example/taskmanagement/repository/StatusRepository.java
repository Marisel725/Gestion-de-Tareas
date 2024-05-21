package com.example.taskmanagement.repository;

import com.example.taskmanagement.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status,Long> {
}
