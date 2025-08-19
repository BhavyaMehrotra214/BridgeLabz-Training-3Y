import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter University Discount Percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
        input.close();
    }
}
