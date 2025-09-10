package FinalKeywordsAndInstanceOperator;

public class PatientMain {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Alice", 30, "Fever");
        Patient p2 = new Patient(2, "Bob", 45, "Diabetes");
        Patient p3 = new Patient(3, "Charlie", 25, "Fracture");
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        Patient.getTotalPatients();
    }
}