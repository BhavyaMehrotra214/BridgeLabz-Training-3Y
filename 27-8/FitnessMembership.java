import java.util.Scanner;

public class FitnessMembership {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            int memberCount = 0;
            do {
                System.out.print("\nEnter number of members to register in this batch: ");
                int n = sc.nextInt();

                for (int i = 1; i <= n; i++) {
                    System.out.println("\nRegistering Member " + i);

                    System.out.println("Select Membership Type: ");
                    System.out.println("1. Monthly (₹1000)");
                    System.out.println("2. Quarterly (₹2500)");
                    System.out.println("3. Yearly (₹9000)");
                    int choice = sc.nextInt();

                    int fee = 0;
                    switch (choice) {
                        case 1:
                            fee = 1000;
                            break;
                        case 2:
                            fee = 2500;
                            break;
                        case 3:
                            fee = 9000;
                            break;
                        default:
                            System.out.println("Invalid choice! Defaulting to Monthly.");
                            fee = 1000;
                    }

                    System.out.print("Are you a Student or Senior Citizen? (yes/no): ");
                    String discountInput = sc.next().toLowerCase();

                    if (discountInput.equals("yes")) {
                        System.out.println("Eligible for 20% discount!");
                        fee = (int) (fee * 0.8);
                    } else {
                        System.out.println("No discount applied.");
                    }

                    System.out.println("Final Membership Fee for Member " + i + ": ₹" + fee);
                    memberCount++;
                }

            } while (memberCount == 0);

            System.out.print("\nDo you want to register more members? (yes/no): ");
            String adminChoice = sc.next().toLowerCase();
            if (adminChoice.equals("no")) {
                keepRunning = false;
                System.out.println("\n--- Registration Closed. Thank you! ---");
            }
        }

        sc.close();
    }
}