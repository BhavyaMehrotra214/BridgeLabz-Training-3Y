package SchoolandStudentswithcourses;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School " + name + " has students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
