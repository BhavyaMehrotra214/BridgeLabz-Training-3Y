package Hospital;

public class HospitalMain {
    public static void main(String[] args) {
       
        Hospital hospital = new Hospital("City Care Hospital");
        
        Doctor drSmith = hospital.addDoctor("Dr. Smith");
        Doctor drJones = hospital.addDoctor("Dr. Jones");

        Patient alice = hospital.addPatient("Alice");
        Patient bob = hospital.addPatient("Bob");

       
        drSmith.consult(alice);
        drSmith.consult(bob);
        drJones.consult(alice);

        
        hospital.showDetails();

        System.out.println();
        drSmith.showPatients();
        drJones.showPatients();

        System.out.println();
        alice.showDoctors();
        bob.showDoctors();
    }
}