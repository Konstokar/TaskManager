package com.taskmanager;

import java.util.*;

public class InMemoryTaskRepository implements TaskRepository{

    private Map<Long, Task> taskMap = new HashMap<>();

    @Override
    public void saveTask(Task task) {
        if (task == null){
            throw new IllegalArgumentException(
                    "Task is null"
            );
        }
        if (task.getId() == null){
            throw new IllegalArgumentException(
                    "Task has null id"
            );
        }
        if (taskMap.containsKey(task.getId())) {
            throw new IllegalArgumentException(
                    "Task with id " + task.getId() + " already exists"
            );
        }
        taskMap.put(task.getId(), task);
    }

    @Override
    public Task findTask(Long id) {
        return taskMap.get(id);
    }

    @Override
    public List<Task> getAllTask() {
        return new ArrayList<>(taskMap.values());
    }

    @Override
    public void removeTask(Long id) {
        taskMap.remove(id);
    }

    @Override
    public void updateTask(Task task) {
        if (!taskMap.containsKey(task.getId())) {
            throw new IllegalArgumentException(
                    "Task with id " + task.getId() + " not found"
            );
        }

        taskMap.put(task.getId(), task);
    }
}
