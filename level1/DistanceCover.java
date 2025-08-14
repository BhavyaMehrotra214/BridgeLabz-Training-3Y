import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.printf("The distance is %.2f feet, which is %.2f yards and %.2f miles\n", feet, yards, miles);
    }
}
