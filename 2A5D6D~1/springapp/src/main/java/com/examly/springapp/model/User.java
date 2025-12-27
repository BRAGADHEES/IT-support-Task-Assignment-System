package com.examly.springapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String role;
    
    @OneToMany(mappedBy = "createdBy")
    private List<Task> createdTasks;
    
    @OneToMany(mappedBy = "user")
    private List<Comment> comments;
    
    @OneToMany(mappedBy = "user")
    private List<TaskAssignment> taskAssignments;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public List<Task> getCreatedTasks() { return createdTasks; }
    public void setCreatedTasks(List<Task> createdTasks) { this.createdTasks = createdTasks; }
    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }
    public List<TaskAssignment> getTaskAssignments() { return taskAssignments; }
    public void setTaskAssignments(List<TaskAssignment> taskAssignments) { this.taskAssignments = taskAssignments; }
}
