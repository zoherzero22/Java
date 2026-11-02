import java.util.Scanner;

public class AgeChecker{
    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int Age = scanner.nextInt(); 

        if (Age < 13) {
            System.out.println("You are a child.");
        } else if (Age < 18) {
            System.out.println("You are a Teenager");
        } else {
            System.out.println("You are an adult20");
        }

        scanner.close();
    } 
}