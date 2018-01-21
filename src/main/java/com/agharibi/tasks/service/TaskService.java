package com.agharibi.tasks.service;

import com.agharibi.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();
}
