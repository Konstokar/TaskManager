package com.taskmanager;

import java.util.List;
import java.util.Objects;

public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = Objects.requireNonNull(taskRepository);
    }

    public void createTask(Task task) {
        taskRepository.saveTask(task);
    }

    public Task findTask(Long id) {
        return taskRepository.findTask(id);
    }

    public List<Task> getAllTasks() {
        return taskRepository.getAllTask();
    }

    public void updateTask(Task task) {
        taskRepository.updateTask(task);
    }

    public void removeTask(Long id) {
        taskRepository.removeTask(id);
    }
}
