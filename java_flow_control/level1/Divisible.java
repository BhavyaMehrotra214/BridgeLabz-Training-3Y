package java_flow_control.level1;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));

        sc.close();
    }
}
