package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
        System.out.println("Hospital " + name + " created.");
    }

    public Doctor addDoctor(String doctorName) {
        Doctor d = new Doctor(doctorName);
        doctors.add(d);
        return d;
    }

    public Patient addPatient(String patientName) {
        Patient p = new Patient(patientName);
        patients.add(p);
        return p;
    }

    public void showDetails() {
        System.out.println("\nHospital " + name + " has:");
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}
