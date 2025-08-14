import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in centimeters: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;

        double areaInch2 = areaCm2 / (2.54 * 2.54);

        System.out.printf("The area of triangle is %.2f cm² and %.2f inches²\n", areaCm2, areaInch2);
    }
}
