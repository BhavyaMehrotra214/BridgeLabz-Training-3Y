package UniversityWithFacultyAndDepartments;

public class UniversityMain {
    public static void main(String[] args) {
        
        University uni = new University("Global Tech University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical Engineering");

        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Prof. Johnson");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        
        uni.showDetails();

        
        uni.cleanup();

        System.out.println("\nFaculty objects still exist after University deletion:");
        System.out.println("Faculty: " + f1.getName());
        System.out.println("Faculty: " + f2.getName());
    }
}