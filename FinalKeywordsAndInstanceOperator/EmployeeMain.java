package FinalKeywordsAndInstanceOperator;
public class EmployeeMain {
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alice", "Software Engineer");
        Employee e2 = new Employee(102, "Bob", "Project Manager");
        Employee e3 = new Employee(103, "Charlie", "HR Executive");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        Employee.displayTotalEmployees();
    }
}

}
