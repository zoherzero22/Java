import java.util.Scanner;
import java.util.ArrayList;

//import java.util.*; falls du alles importieren willst

public class TodoList {

    public static void main(String[] args) {

        int op = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (op != 4) {

            System.out.println("1-View Tasks");
            System.out.println("2-Add Task");
            System.out.println("3-Delete Task");
            System.out.println("4-Exit");
            System.out.print("pleasae choose one of the upove listed options (Numbers only): ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {

                case 1:

                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }

                    String b = "";
                    while (!b.equals("yes")) {
                        System.out.print("Back to menu? ");
                        b = scanner.nextLine();

                        switch (b) {
                            case ("yes"):
                                break;
                            default:
                                System.out.println("Invalid Action");
                                break;
                        }
                    }

                    break;

                case 2:

                    System.out.print("Write the task you want to add to your list: ");
                    String ntasks = scanner.nextLine();
                    tasks.add(ntasks);
                    System.out.println("Task added successfully!");

                    String a = "";
                    System.out.print("Do you want to add more Tasks? ");
                    a = scanner.nextLine();

                    while (!a.equals("no")) {
                        switch (a) {
                            case ("yes"):

                                System.out.print("Write the task you want to add to your list: ");
                                ntasks = scanner.nextLine();
                                tasks.add(ntasks);
                                System.out.println("Task added successfully!");

                                System.out.print("Add more tasks? ");
                                b = scanner.nextLine();

                                switch (b) {
                                    case ("yes"):
                                        break;
                                    case ("no"):
                                        a = b;
                                        break;
                                    default:
                                        System.out.println("Invalid Action");
                                        break;
                                }

                                break;
                            case ("no"):
                                break;
                            default:
                                System.out.println("Invalid Action");
                                break;

                        }
                    }

                    break;

                case 3:

                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty, nothing to delete!");
                    } else {
                        System.out.print("Enter the task number you want to delete: ");
                        int taskNum = scanner.nextInt();

                        int index = taskNum - 1;

                        if (index >= 0 && index < tasks.size()) {
                            tasks.remove(index);
                            System.out.println("Task deleted successfully!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Exiting ");
                    break;
                default:
                    System.out.println("Invalid choice! Please pick 1-4.");
                    break;
            }

        }

        scanner.close();

    }

}