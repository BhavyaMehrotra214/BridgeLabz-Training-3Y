package SchoolandStudentswithcourses;


import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void showStudents() {
        System.out.println("Course " + courseName + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
