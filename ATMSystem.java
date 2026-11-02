import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {

        double balance = 455.50;

        Scanner scanner = new Scanner(System.in);
        String request = "";
        String pw = "";

        while (!pw.equals("cat")) {                                        
            System.out.print("Give ur password: ");
            pw = scanner.nextLine();

            if (pw.equals("cat")) {                                        
                System.out.println("Correct password");
            } else {
                System.out.println("Wrong password");
            }
        }                                                                  
 
        while (!request.equals("End Programm")) {

            System.out.println("Check Balance, Deposit Money, Withdraw Money, End Programm");
            System.out.print("Choose ur request: ");
            request = scanner.nextLine();

            if (request.equals("Check Balance")) { 

                System.out.println("Your Balance is: " + balance);

            } else if (request.equals("Deposit Money")) {

                System.out.print("How much money do u want to deposit? ");
                double depositAmount = scanner.nextDouble();
                scanner.nextLine();
                balance = balance + depositAmount;
                System.out.println(depositAmount + " was added to your account");

            } else  if (request.equals("Withdraw Money")){

                System.out.print("how much money do you want to withdraw? ");
                double Wmoney = scanner.nextDouble();
                scanner.nextLine();
                balance = balance - Wmoney;
                System.out.println(Wmoney + " has been withdrawed from your account");
                

            } else {

                request = "End Programm";

            }
        
        }
        
        scanner.close();
    }
}