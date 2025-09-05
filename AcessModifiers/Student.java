package AcessModifiers;
public class Student {
    public int rollNumber;       
    protected String name;       
    private double cgpa;         

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }


    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value!");
        }
    }

    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
    }
}
