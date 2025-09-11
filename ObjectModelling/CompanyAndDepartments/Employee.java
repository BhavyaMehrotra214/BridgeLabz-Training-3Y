package CompanyAndDepartments;
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
        System.out.println("Employee " + name + " created.");
    }

    public String getName() {
        return name;
    }

    public void cleanup() {
        System.out.println("Employee " + name + " deleted.");
    }
}
