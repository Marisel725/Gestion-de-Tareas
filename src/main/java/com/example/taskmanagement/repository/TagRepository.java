package com.example.taskmanagement.repository;

import com.example.taskmanagement.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {
}
