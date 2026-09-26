import com.taskmanager.Task;
import com.taskmanager.TaskStatus;

import java.util.HashMap;
import java.util.Map;

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

        Map<Task, String> taskMap = new HashMap<>();

        Task mapTask = new Task(
                1L,
                "Learn Java",
                "Study Java Core",
                TaskStatus.TODO
        );

        taskMap.put(mapTask, "Моя задача");

        System.out.println(taskMap.get(mapTask));
    }
}
