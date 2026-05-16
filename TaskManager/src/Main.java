import java.util.List;
import java.util.Scanner;
import exception.InvalidInputException;
import exception.TaskNotFoundException;
import file.TaskLoader;
import file.TaskSaver;
import model.Task;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "tasks.txt";
        TaskLoader loader = new TaskLoader(fileName);
        TaskSaver saver = new TaskSaver(fileName);
        List<Task> tasks = loader.load();
        refreshTaskIds(tasks);
        int idCounter = tasks.size() + 1;

        while (true) {
            System.out.println("\n==== TASK MANAGER ====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Done");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }
            try {
                if (choice == 1) {
                    System.out.print("Title: ");
                    String title = sc.nextLine().trim();
                    if (title.isEmpty()) {
                        System.out.println("Title cannot be empty.");
                    } else {
                        tasks.add(new Task(idCounter++, title, false));
                        saver.save(tasks);
                        System.out.println("Task added.");
                    }
                }
                else if (choice == 2) {
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks yet.");
                    } else {
                        for (Task t : tasks) {
                            System.out.println(t);
                        }
                    }
                }
                else if (choice == 3) {
                    System.out.print("Enter ID: ");
                    int id;
                    try {
                        id = Integer.parseInt(sc.nextLine().trim());
                    } catch (Exception e) {
                        throw new InvalidInputException("ID must be number");
                    }
                    boolean found = tasks.removeIf(t -> t.id == id);
                    if (!found) {
                        throw new TaskNotFoundException("Task not found!");
                    }
                    refreshTaskIds(tasks);
                    idCounter = tasks.size() + 1;
                    saver.save(tasks);
                    System.out.println("Task removed.");
                }
                else if (choice == 4) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice!");
                }
            } catch (InvalidInputException | TaskNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    private static void refreshTaskIds(List<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).id = i + 1;
        }
    }
}