package UniversityMangement;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);  
            System.out.println(name + " enrolled in " + course.getCourseName());
        }
    }

    public void showCourses() {
        System.out.println("\nCourses for student " + name + ":");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}
