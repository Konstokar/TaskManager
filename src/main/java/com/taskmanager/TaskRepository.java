package com.taskmanager;

import java.util.List;

public interface TaskRepository {

    void saveTask(Task task);

    Task findTask(Long id);

    List<Task> getAllTask();

    void removeTask(Long id);

    void updateTask(Task task);

}
