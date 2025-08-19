package java_flow_control.level1;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        System.out.println("first number the largest? " + (n1 > n2 && n1 > n3));
        System.out.println("second number the largest? " + (n2 > n1 && n2 > n3));
        System.out.println("third number the largest? " + (n3 > n1 && n3 > n2));

        sc.close();
    }
}

