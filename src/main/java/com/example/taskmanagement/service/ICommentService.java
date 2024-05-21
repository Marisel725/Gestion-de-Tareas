package com.example.taskmanagement.service;

import com.example.taskmanagement.entity.Comment;

import java.util.List;
import java.util.Optional;

public interface ICommentService {
    List<Comment> findAll();

    Optional<Comment> findById(Long id);

    Comment save(Comment comment);

    void deleteById(Long id);
}
