package SchoolandStudentswithcourses;

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

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // maintain two-way association
        }
    }

    // View enrolled courses
    public void showCourses() {
        System.out.println("Student " + name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}
