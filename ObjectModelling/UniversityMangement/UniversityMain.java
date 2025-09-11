package UniversityMangement;

public class UniversityMain {
    public static void main(String[] args) {
      
        Professor profJohn = new Professor("Dr. John");
        Professor profEmma = new Professor("Dr. Emma");

        Course javaCourse = new Course("Java Programming");
        Course dbCourse = new Course("Database Systems");

      
        profJohn.assignCourse(javaCourse);
        profEmma.assignCourse(dbCourse);

      
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        
        alice.enrollCourse(javaCourse);
        alice.enrollCourse(dbCourse);
        bob.enrollCourse(javaCourse);


        javaCourse.showDetails();
        dbCourse.showDetails();

        alice.showCourses();
        bob.showCourses();
        profJohn.showCourses();
        profEmma.showCourses();
    }
}