package Javaclassandobject.level2;
import java.util.Scanner;
public class BankAcoountMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);

        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            double amount;

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
