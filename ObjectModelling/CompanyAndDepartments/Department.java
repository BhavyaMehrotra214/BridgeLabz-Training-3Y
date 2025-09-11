package CompanyAndDepartments;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
        System.out.println("Department " + name + " created.");
    }

    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    public void cleanup() {
        System.out.println("Department " + name + " deleted.");
        for (Employee e : employees) {
            e.cleanup();
        }
        employees.clear();
    }
}
