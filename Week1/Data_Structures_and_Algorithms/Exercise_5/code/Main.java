package Week1.Data_Structures_and_Algorithms.Exercise_5.code;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Task 1", "Pending"));
        taskList.addTask(new Task(2, "Task 2", "Completed"));
        taskList.addTask(new Task(3, "Task 3", "In Progress"));

        // Traversing tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        Task searchedTask = taskList.searchTask(2);
        System.out.println("Searched Task: " + searchedTask);

        // Deleting a task
        taskList.deleteTask(2);
        System.out.println("Tasks after deletion:");
        taskList.traverseTasks();
    }
}
