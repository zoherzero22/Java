import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String guess = "";
           
        while (!guess.equals("exit")) {
            System.out.print("Type a word: ");
            guess = scanner.nextLine();
            System.out.println(guess);
        }

        System.out.print("Goodbye!!");

        scanner.close();

    }
}