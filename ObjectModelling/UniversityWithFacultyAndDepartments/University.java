package UniversityWithFacultyAndDepartments;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.name = name;
        System.out.println("University " + name + " created.");
    }

    
    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        System.out.println("Faculty " + faculty.getName() + " added to University " + name);
    }

    
    public void showDetails() {
        System.out.println("\nUniversity " + name + " has departments:");
        for (Department d : departments) {
            System.out.println(" - " + d.getName());
        }

        System.out.println("University " + name + " has faculties:");
        for (Faculty f : faculties) {
            System.out.println(" - " + f.getName());
        }
    }

    public void cleanup() {
        System.out.println("\nDeleting University " + name + "...");
        for (Department d : departments) {
            d.cleanup(); 
        }
        departments.clear();

        System.out.println("Faculties are not deleted with University (aggregation):");
        for (Faculty f : faculties) {
            f.cleanup(); 
        faculties.clear();
    }
}
}