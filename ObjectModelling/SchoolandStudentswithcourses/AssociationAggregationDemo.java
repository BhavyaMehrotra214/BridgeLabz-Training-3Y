package SchoolandStudentswithcourses;

public class AssociationAggregationDemo {
    public static void main(String[] args) {
        
        School school = new School("Greenwood High");

       
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

    
        school.addStudent(alice);
        school.addStudent(bob);

       
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

       
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(math);

        
        school.showStudents();

        System.out.println();


        alice.showCourses();
        bob.showCourses();

        System.out.println();


        math.showStudents();
        science.showStudents();
    }
}