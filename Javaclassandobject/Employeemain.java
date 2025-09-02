package Javaclassandobject;

public class Employeemain {
    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("Bhavya", 23, 7000);
        EmployeeDetails emp2 = new EmployeeDetails("Rahul", 102, 60000);

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}
