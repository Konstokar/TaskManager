import com.taskmanager.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Task task1 = new Task(
                1L,
                "Learn Java",
                "Study Java Core",
                TaskStatus.TODO
        );

        Task task2 = new Task(
                1L,
                "Learn Java",
                "Study Java Core",
                TaskStatus.TODO
        );

        TaskRepository repository = new InMemoryTaskRepository();

        repository.saveTask(task1);

        System.out.println(repository.findTask(1L));
        System.out.println(repository.findTask(2L));
        System.out.println(repository.findTask(999L));

        System.out.println(repository.getAllTask());

        repository.removeTask(1L);

        System.out.println(repository.getAllTask());

        repository.saveTask(task1);

        task1.setTitle("Learn Java deeply");

        repository.updateTask(task1);

        System.out.println(repository.findTask(1L));
    }
}
