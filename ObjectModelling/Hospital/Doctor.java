package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<Patient> patients = new ArrayList<>();

    public Doctor(String name) {
        this.name = name;
        System.out.println("Doctor " + name + " created.");
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); 
        }
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Doctor " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}
