package Javaclassandobject.level2;
import java.util.Scanner;
public class MovieTicketMain {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();
        int choice;
        do {
            System.out.println("\n=== Movie Ticket Booking ===");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter movie name: ");
                    String movie = scanner.nextLine();

                    System.out.print("Enter seat number: ");
                    String seat = scanner.nextLine();

                    System.out.print("Enter ticket price: ");
                    double price = scanner.nextDouble();

                    ticket.bookTicket(movie, seat, price);
                    break;

                case 2:
                    ticket.displayTicket();
                    break;

                case 3:
                    System.out.println("Exiting system. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
