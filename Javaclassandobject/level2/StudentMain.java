package Javaclassandobject.level2;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Smith", 101, 88);
        Student student2 = new Student("Bob Johnson", 102, 47);

        student1.displayDetails();
        student2.displayDetails();
    }
}
