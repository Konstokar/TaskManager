import com.taskmanager.Box;
import com.taskmanager.Task;
import com.taskmanager.TaskStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

        Box<Task> taskBox = new Box<>(task1);
        // Box<String> stringBox = new Box<>("Hello"); <- error
        // Box<Long> idBox = new Box<>(100L); <- error

        Task task = taskBox.getType();
        // String text = stringBox.getType(); <- error
        // Long id = idBox.getType(); <- error

        // String wrong = taskBox.getType(); <- error
    }
}
