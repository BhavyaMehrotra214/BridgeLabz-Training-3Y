package UniversityWithFacultyAndDepartments;

public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
        System.out.println("Faculty " + name + " created.");
    }

    public String getName() {
        return name;
    }

    public void cleanup() {
        System.out.println("Faculty " + name + " still exists independently.");
    }
}
