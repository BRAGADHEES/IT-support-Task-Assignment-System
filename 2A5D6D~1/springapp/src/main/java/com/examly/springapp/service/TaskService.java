package com.examly.springapp.service;

import com.examly.springapp.model.Task;
import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task saveTask(Task task);
    List<Task> getAllTasks();
    Optional<Task> getTaskById(Long id);
    Task updateTask(Long id, Task task);
}
