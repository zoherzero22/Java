import java.util.Scanner; // Imports the Scanner tool

public class Scanning {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  // creates a scanner

       
        System.out.print("What is your name? ");
        String name = scanner.nextLine(); // takes the scanned string

        System.out.print("How old are you? ");
        int age = scanner.nextInt();  // takes the scanned int

        System.out.println("\n--- Results ---");
        System.out.println("Hello, " + name + "! It's awesome that you are " + age + " years old.");
        System.out.println("You are officially writing interactive Java programs!");

        scanner.close(); // closes the scanner
    }
}