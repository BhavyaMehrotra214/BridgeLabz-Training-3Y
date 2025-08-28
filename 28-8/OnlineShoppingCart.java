import java.util.Scanner;
public class OnlineShoppingCart {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;
        while (moreCustomers) {
            int choice;
            int total = 0;
            int quantity;
            int addeditems = 0;
            do {
                System.out.println("1: Laptop - 4000");
                System.out.println("2: Camera - 500");
                System.out.println("3: Keychain - 50");
                System.out.println("4: Mouse - 600");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                switch (choice) {
                    case 1:
                        total += 4000 * quantity;
                        break;
                    case 2:
                        total += 500 * quantity;
                        break;
                    case 3:
                        total += 50 * quantity;
                        break;
                    case 4:
                        total += 600 * quantity;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                addeditems++;
                System.out.print("Do you want to add more items? (yes=1 / no=0): ");
            } while (sc.nextInt() == 1);

            if (total > 5000) {
                System.out.println("\nYou got a discount of 10%!");
                total = total - (total * 10 / 100);
            }

            System.out.println("Final bill:" + total);

    
            System.out.print("\nNext customer? (yes=1 / no=0): ");
            int next = sc.nextInt();
            if (next == 0) {
                moreCustomers = false;
                System.out.println("Thank you for shopping with us!");
            }
        }

        sc.close();
    }
}
