package CompanyAndDepartments;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
        System.out.println("Company " + name + " created.");
    }

    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    public void cleanup() {
        System.out.println("Company " + name + " deleted.");
        for (Department d : departments) {
            d.cleanup();
        }
        departments.clear();
    }
}
