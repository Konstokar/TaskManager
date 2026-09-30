package com.taskmanager;

public class Box<T extends Task> {

    private T type;

    public Box(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }
}
