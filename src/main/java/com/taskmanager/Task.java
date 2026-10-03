package com.taskmanager;

public class Task {
    private final Long id;
    private String title, description;
    private TaskStatus status;

    public Task(Long id, String title, String description, TaskStatus status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (obj instanceof Task){
            if (obj.getClass() != this.getClass()){
                return false;
            }
            if (this.getId() == null || ((Task) obj).getId() == null) {
                return false;
            }
            Task task = (Task) obj;
            return ((Task) obj).getId().equals(task.getId());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Task{id=%d, title=%s, description=%s, status=%s}", id, title, description, status);
    }
}
