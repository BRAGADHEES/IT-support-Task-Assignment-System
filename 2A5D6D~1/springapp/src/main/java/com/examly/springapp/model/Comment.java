package com.examly.springapp.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String content;
    
    private LocalDateTime createdAt;
    
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    public Comment() {}
    
    public Comment(String content, Task task, User user) {
        this.content = content;
        this.task = task;
        this.user = user;
        this.createdAt = LocalDateTime.now();
    }
    
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    
    public Task getTask() { return task; }
    public void setTask(Task task) { this.task = task; }
    
    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
