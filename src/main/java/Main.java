import com.taskmanager.Task;
import com.taskmanager.TaskStatus;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
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

        Set<Task> tasks = new HashSet<>();

        tasks.add(task1);

        System.out.println(task1.equals(task2));
        System.out.println(task1.hashCode());
        System.out.println(task2.hashCode());
        System.out.println(tasks.contains(task2));
    }
}
