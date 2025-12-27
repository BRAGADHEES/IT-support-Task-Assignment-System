package com.examly.springapp.controller;

import com.examly.springapp.model.TaskStatusLog;
import com.examly.springapp.service.TaskStatusLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/status-logs")
public class TaskStatusLogController {
    
    @Autowired
    private TaskStatusLogService statusLogService;
    
    @PostMapping
    public ResponseEntity<TaskStatusLog> createStatusLog(@RequestBody TaskStatusLog statusLog) {
        TaskStatusLog savedLog = statusLogService.saveStatusLog(statusLog);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedLog);
    }
    
    @GetMapping
    public ResponseEntity<List<TaskStatusLog>> getAllStatusLogs() {
        List<TaskStatusLog> logs = statusLogService.getAllStatusLogs();
        return ResponseEntity.ok(logs);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TaskStatusLog> getStatusLogById(@PathVariable Long id) {
        Optional<TaskStatusLog> log = statusLogService.getStatusLogById(id);
        return log.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping("/task/{taskId}")
    public ResponseEntity<List<TaskStatusLog>> getLogsByTask(@PathVariable Long taskId) {
        List<TaskStatusLog> logs = statusLogService.getLogsByTask(taskId);
        return ResponseEntity.ok(logs);
    }
    
    @GetMapping("/old/{oldStatus}")
    public ResponseEntity<?> getLogsByOldStatus(@PathVariable String oldStatus) {
        List<TaskStatusLog> logs = statusLogService.getLogsByOldStatus(oldStatus);
        if (logs.isEmpty()) {
            return ResponseEntity.status(204).body("No logs found with oldStatus: " + oldStatus);
        }
        return ResponseEntity.ok(logs);
    }
}
