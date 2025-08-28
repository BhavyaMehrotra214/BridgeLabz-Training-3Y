import java.util.Scanner;

public class TrainReservation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available Trains:");
        System.out.println("1. Rajdhani Express - 1200");
        System.out.println("2. Shatabdi Express - 1000");
        System.out.println("3. Garib Rath - 700");
        System.out.print("Select Train (1-3): ");
        int choice = sc.nextInt();

        int fare;
        String trainName;
        switch (choice) {
            case 1: trainName = "Rajdhani Express"; fare = 1200; break;
            case 2: trainName = "Shatabdi Express"; fare = 1000; break;
            case 3: trainName = "Garib Rath"; fare = 700; break;
            default: trainName = "Garib Rath"; fare = 700; break;
        }

        System.out.println("\nYou chose: " + trainName + " (Fare: " + fare + " per seat)");
        int totalSeats = 5;   
        int booked = 0;
        int waiting = 0;

        char moreBooking;

        do {
            System.out.print("\nEnter number of passengers to book: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                if (booked < totalSeats) {
                    booked++;
                    System.out.println("Passenger " + i + " → Seat Confirmed (Seat " + booked + ")");
                } else {
                    waiting++;
                    System.out.println("Passenger " + i + " → Waiting List #" + waiting);
                }
            }

            System.out.print("More bookings? (y/n): ");
            moreBooking = sc.next().charAt(0);

        } while (moreBooking == 'y' || moreBooking == 'Y');
        while (booked < totalSeats) {
            System.out.println("\nSeats still available → " + (totalSeats - booked));
            break;
        }
        System.out.println("Train: " + trainName);
        System.out.println("Seats Booked: " + booked);
        System.out.println("Waiting List: " + waiting);
        System.out.println("Total Fare Collected: " + (booked * fare));
    sc.close();
    }
}
