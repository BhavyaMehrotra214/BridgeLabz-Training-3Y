package Javaclassandobject.level2;

public class Student {
    // Student.java
    private String name;
    private int rollNumber;
    private int marks;
    private String grade;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = calculateGrade(); 
    }
    private String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + grade);
    }
}