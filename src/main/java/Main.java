import com.taskmanager.Task;
import com.taskmanager.TaskStatus;

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

        System.out.println(task1 == task2);
        System.out.println(task1.equals(task2));

        // 1. Тот же объект
        System.out.println(task1.equals(task1));

// 2. null
        System.out.println(task1.equals(null));

// 3. Совершенно другой тип
        System.out.println(task1.equals("Hello"));

        Task task3 = new Task(
                null,
                "Task 3",
                "Description",
                TaskStatus.TODO
        );

        Task task4 = new Task(
                null,
                "Task 4",
                "Description",
                TaskStatus.DONE
        );

        System.out.println(task3.equals(task4));
    }
}
