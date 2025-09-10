package FinalKeywordsAndInstanceOperator;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "A");
        Student s2 = new Student(102, "Bob", "B");

    
        s1.displayDetails();
        s2.displayDetails();
        s2.updateGrade("A");

        s2.displayDetails();
        Student.displayTotalStudents();
    }
}