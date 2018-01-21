package com.agharibi.tasks.service;

import com.agharibi.tasks.domain.Task;
import com.agharibi.tasks.respository.TaskRepository;
import org.springframework.stereotype.Service;

@Service("taskService")
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
