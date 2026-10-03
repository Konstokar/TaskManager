package com.taskmanager;

import java.util.List;
import java.util.Map;

public interface TaskRepository {

    // private Map<Long, Task> taskRepository;

    public void saveTask(Task task);

    public Task findTask(Long id);

    public List<Task> getAllTask();

    public void removeTask(Long id);

    public void updateTask(Task task);

}
