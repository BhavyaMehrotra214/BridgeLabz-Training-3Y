package instances;

public class CourseMain {
    public static void main(String[] args) {

        Course c1 = new Course("Java Programming", 12, 15000);
        Course c2 = new Course("Web Development", 16, 20000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        System.out.println("\nAfter updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
