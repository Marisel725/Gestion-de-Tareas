package com.example.taskmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TASKS") //tareas
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private boolean completed;
//Debería tener una fecha de comienzo y de fin ?
    private LocalDateTime createdDate;
    private LocalDateTime dueDate;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;
    @OneToMany(mappedBy = "task")
    private Set<Comment> comments;
    @ManyToMany
    @JoinTable(
            name = "TASK_TAGS",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags;
    @ManyToOne
    @JoinColumn(name = "priority_id")
    private Priority priority;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

}
