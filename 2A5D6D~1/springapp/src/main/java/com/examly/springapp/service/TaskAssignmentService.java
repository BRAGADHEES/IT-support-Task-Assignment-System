package com.examly.springapp.service;

import com.examly.springapp.model.TaskAssignment;
import java.util.List;

public interface TaskAssignmentService {
    List<TaskAssignment> getAssignmentsByUserId(Long userId);
}
