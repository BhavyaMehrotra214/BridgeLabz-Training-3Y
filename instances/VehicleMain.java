package instances;
public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aarav", "Car");
        Vehicle v2 = new Vehicle("Isha", "Motorcycle");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000.0);

        System.out.println("\nAfter updating registration fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
