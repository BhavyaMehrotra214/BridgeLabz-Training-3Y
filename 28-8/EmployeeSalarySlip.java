import java.util.Scanner;

public class EmployeeSalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] employees = new String[n];
        int[] basicsalary = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of employee " + (i + 1) );
            employees[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Enter basic salary of employee " + (i + 1) );
            basicsalary[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            String name = employees[i];
            int basic = basicsalary[i];

            double hra = 0.20 * basic;
            double da = 0.10 * basic;
            double netsalary = basic + hra + da;

            double tax = 0;
            if (netsalary > 5000) {   
                tax = 0.10 * netsalary;
                netsalary -= tax;
            }
            System.out.println("Employee Name : " + name);
            System.out.println("Basic Salary  : " + basic);
            System.out.println("HRA (20%)     : " + hra);
            System.out.println("DA (10%)      : " + da);

            System.out.println("Net Salary    : " + netsalary);
        }

        sc.close();
    }
}
