package AcessModifiers;
public class PostgraduateStudent extends Student {

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + 
                           ", CGPA: " + getCgpa() + ", Specialization: " + specialization);
    }
}

