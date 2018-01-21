package com.agharibi.tasks.controller;

import com.agharibi.tasks.domain.Task;
import com.agharibi.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"", "/"})
    public Iterable<Task> list() {
        return taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
