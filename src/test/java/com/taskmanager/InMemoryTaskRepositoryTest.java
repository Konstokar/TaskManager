package com.taskmanager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryTaskRepositoryTest {

    @Test
    void saveTaskShouldAllowFindingSavedTask() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task1 = new Task(
                1L,
                "Learn Java",
                "Study Java Core",
                TaskStatus.TODO
        );
        repository.saveTask(task1);
        assertEquals(task1, repository.findTask(task1.getId()));
    }

    @Test
    void findTaskShouldReturnNullWhenTaskDoesNotExist() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        assertNull(repository.findTask(999L));
    }

    @Test
    void saveTaskShouldThrowExceptionWhenIdAlreadyExists() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task1 = new Task(
                1L,
                "Learn Java",
                "Study Java Core",
                TaskStatus.TODO
        );
        repository.saveTask(task1);
        Task task666 = new Task(
                1L,
                "Learn Spring",
                "Study Spring",
                TaskStatus.TODO
        );
        assertThrows(
                IllegalArgumentException.class,
                () -> repository.saveTask(task666)
        );
    }

    @Test
    void saveTaskShouldThrowExceptionWhenTaskIsNull() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        assertThrows(
                IllegalArgumentException.class,
                () -> repository.saveTask(null)
        );
    }

    @Test
    void saveTaskShouldThrowExceptionWhenTaskIdIsNull() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task666 = new Task(
                null,
                "Learn Spring",
                "Study Spring",
                TaskStatus.TODO
        );
        assertThrows(
                IllegalArgumentException.class,
                () -> repository.saveTask(task666)
        );
    }

    @Test
    void updateTaskShouldUpdateExistingTask() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task1 = new Task(
                1L,
                "Learn Java",
                "Study Java",
                TaskStatus.TODO
        );
        repository.saveTask(task1);
        Task task1_1 = new Task(
                1L,
                "Learn Spring",
                "Study Spring",
                TaskStatus.TODO
        );
        repository.updateTask(task1_1);
        assertEquals("Learn Spring", repository.findTask(1L).getTitle());
    }

    @Test
    void updateTaskShouldThrowExceptionWhenTaskDoesNotExist() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task999 = new Task(
                999L,
                "Learn Java",
                "Study Java",
                TaskStatus.TODO
        );
       assertThrows(
               IllegalArgumentException.class,
               () -> repository.updateTask(task999)
       );
    }

    @Test
    void removeTaskShouldRemoveExistingTask() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task1 = new Task(
                1L,
                "Learn Java",
                "Study Java",
                TaskStatus.TODO
        );
        repository.saveTask(task1);
        repository.removeTask(task1.getId());
        assertNull(repository.findTask(1L));
    }

    @Test
    void removeTaskShouldNotAffectOtherTasks() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task1 = new Task(
                1L,
                "Learn Java",
                "Study Java",
                TaskStatus.TODO
        );
        Task task2 = new Task(
                2L,
                "Learn Spring",
                "Study Spring",
                TaskStatus.TODO
        );
        repository.saveTask(task1);
        repository.saveTask(task2);
        repository.removeTask(task1.getId());
        assertEquals(task2, repository.findTask(2L));
    }

    @Test
    void updateTaskShouldThrowExceptionWhenTaskIsNull() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        assertThrows(
                IllegalArgumentException.class,
                () -> repository.updateTask(null)
        );
    }

    @Test
    void updateTaskShouldThrowExceptionWhenTaskIdIsNull() {
        InMemoryTaskRepository repository = new InMemoryTaskRepository();
        Task task = new Task(
                null,
                "Learn Java",
                "Study Java Core",
                TaskStatus.TODO
        );
        assertThrows(
                IllegalArgumentException.class,
                () -> repository.updateTask(task)
        );
    }
}