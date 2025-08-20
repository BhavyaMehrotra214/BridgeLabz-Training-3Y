package Array.level2;
import java.util.Scanner;
public class Bonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees:")
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();


            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again for Employee " + (i + 1));
                i--; 
                continue;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];


            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Bonus and Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +", Years of Service = " + yearsOfService[i] +", Bonus = " + bonus[i] +", New Salary = " + newSalary[i]);
        }
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        sc.close();
    }
}
