package Inheritance.EmploymentManagementSystem;


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, 10);
        Developer developer = new Developer("Bob", 102, 70000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, "XYZ University");

        Employee[] employees = {manager, developer, intern};

        for (Employee e : employees) {
            e.displayDetails();
            System.out.println();
        }
    }
}