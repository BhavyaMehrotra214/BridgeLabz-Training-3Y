import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = input.nextInt();

        System.out.print("Enter value of b: ");
        int b = input.nextInt();

        System.out.print("Enter value of c: ");
        int c = input.nextInt();

        int op1 = a + b * c;  // Multiplication has higher precedence than addition
        int op2 = a * b + c;  // Multiplication first, then addition
        int op3 = c + a / b;  // Division before addition
        int op4 = a % b + c;  // Modulus before addition

        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", op1, op2, op3, op4);
    }
}
