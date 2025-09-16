package Inheritance.EmploymentManagementSystem;

public class Intern extends Employee {
    String school;

    public Intern(String name, int id, double salary, String school) {
        super(name, id, salary);
        this.school = school;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("School/University: " + school);
    }
}
