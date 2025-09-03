package Javaclassandobject.level2;
import java.util.Scanner;
public class PalindromeStringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text to check for palindrome: ");
        String input = scanner.nextLine();

        PalindromeString checker = new PalindromeString(input);
        checker.displayResult();

        scanner.close();
    }
}