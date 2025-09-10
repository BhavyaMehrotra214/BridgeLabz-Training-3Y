package FinalKeywordsAndInstanceOperator;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Alice", "Car");
        Vehicle v2 = new Vehicle("DL05XY9876", "Bob", "Motorcycle");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(7000.0);

        v1.displayDetails();
        v2.displayDetails();
    }
}
