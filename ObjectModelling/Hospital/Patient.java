package Hospital;


import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();

    public Patient(String name) {
        this.name = name;
        System.out.println("Patient " + name + " created.");
    }

    public String getName() {
        return name;
    }

    
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " has consulted with:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName());
        }
    }
}