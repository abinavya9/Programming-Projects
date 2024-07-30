import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList
{
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) 
  {
        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Delete task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 
            switch (option) 
            {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
       }
}

  private static void addTask() 
  {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added!");
  }

  private static void viewTasks() 
  {
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks available.");
        } 
        else 
        {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) 
            {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

  private static void deleteTask() 
  {
        if (tasks.isEmpty()) 
        {
            System.out.println("No tasks available.");
        } 
        else 
        {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) 
            {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.print("Enter task number to delete: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine(); 
            if (taskNumber > 0 && taskNumber <= tasks.size()) 
            {
                tasks.remove(taskNumber - 1);
                System.out.println("Task deleted!");
            } 
            else 
            {
                System.out.println("Invalid task number.");
            }
        }
    }
}

