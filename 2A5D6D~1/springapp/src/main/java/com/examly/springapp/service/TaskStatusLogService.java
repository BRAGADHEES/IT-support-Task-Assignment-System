package com.examly.springapp.service;

import com.examly.springapp.model.TaskStatusLog;
import java.util.List;
import java.util.Optional;

public interface TaskStatusLogService {
    TaskStatusLog saveStatusLog(TaskStatusLog statusLog);
    List<TaskStatusLog> getAllStatusLogs();
    Optional<TaskStatusLog> getStatusLogById(Long id);
    List<TaskStatusLog> getLogsByTask(Long taskId);
    List<TaskStatusLog> getLogsByOldStatus(String oldStatus);
}
