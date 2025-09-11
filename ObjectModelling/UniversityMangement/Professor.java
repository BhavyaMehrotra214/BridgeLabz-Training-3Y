package UniversityMangement;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this); 
            System.out.println("Professor " + name + " assigned to " + course.getCourseName());
        }
    }

    public void showCourses() {
        System.out.println("\nCourses taught by Professor " + name + ":");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}