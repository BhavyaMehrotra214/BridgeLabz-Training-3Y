package UniversityWithFacultyAndDepartments;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
        System.out.println("Department " + name + " created.");
    }

    public String getName() {
        return name;
    }

    public void cleanup() {
        System.out.println("Department " + name + " deleted.");
    }
}
