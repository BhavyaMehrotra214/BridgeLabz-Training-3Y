package Inheritance.VehicleAndTransportSystem;

public class TransportSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(180, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15.5);
        Vehicle motorcycle = new MotorCycle(150, "Petrol", false);

        Vehicle[] vehicles = {car, truck, motorcycle};

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();
        }
    }
}