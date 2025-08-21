package Array.level2;
import java.util.Scanner;
public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int s = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            if (s == maxDigit) {
                break; 
            }
            digits[s++] = digit;
        }
        int largest = 0, secondLargest = 0;
        for (int i = 0; i <s; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit = " + largest);
        System.out.println("Second Largest digit = " + secondLargest);

        sc.close();
    }
}
