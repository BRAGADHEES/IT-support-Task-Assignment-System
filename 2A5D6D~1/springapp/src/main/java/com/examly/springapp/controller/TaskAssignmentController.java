package com.examly.springapp.controller;

import com.examly.springapp.model.TaskAssignment;
import com.examly.springapp.service.TaskAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/assignments")
public class TaskAssignmentController {

    @Autowired
    private TaskAssignmentService taskAssignmentService;

    @GetMapping
    public String getAssignments() {
        return "Assignments";
    }
    
    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getAssignmentsByUserId(@PathVariable Long userId) {
        List<TaskAssignment> assignments = taskAssignmentService.getAssignmentsByUserId(userId);
        if (assignments.isEmpty()) {
            return ResponseEntity.status(204).body("No assignments found for user id: " + userId);
        }
        return ResponseEntity.ok(assignments);
    }
}
