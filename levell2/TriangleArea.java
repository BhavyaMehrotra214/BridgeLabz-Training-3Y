import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in centimeters: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / (2.54 * 2.54); // Convert cm² to in²

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaIn2, areaCm2);
    }
}
