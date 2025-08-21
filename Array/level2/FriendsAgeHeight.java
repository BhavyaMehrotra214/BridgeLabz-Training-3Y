package Array.level2;
import java.util.Scanner;
public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Age: ");
            ages[i] = sc.nextInt();
            System.out.print("Height in cm: ");
            heights[i] = sc.nextDouble();

            if (ages[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input! Please re-enter for " + names[i]);
            }
        }

        int youngestIndex = 0;
        int tallestIndex = 0;


        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is " + names[youngestIndex] +" with age " + ages[youngestIndex] + " years.");
        System.out.println("The tallest friend is " + names[tallestIndex]+" with height " + heights[tallestIndex] + " cm.");

        sc.close();
    }
}
