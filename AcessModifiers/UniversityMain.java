package AcessModifiers;
public class UniversityMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayDetails();

        s1.setCgpa(9.2);
        System.out.println("Updated CGPA: " + s1.getCgpa());

        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 9.0, "Computer Science");
        pg.displayDetails();
    }
}