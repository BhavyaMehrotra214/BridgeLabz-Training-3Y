import java.util.Scanner;
public class ArrayIndexOutOfBound {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); 
    }
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught generic RuntimeException: " + e);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        String[] names = new String[size];
        System.out.println("Enter " + size + " names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        handleException(names);

        sc.close();
    }
}

