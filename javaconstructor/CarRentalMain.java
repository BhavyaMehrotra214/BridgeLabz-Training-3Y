package javaconstructor;

public class CarRentalMain {
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();

        CarRental rental2 = new CarRental("Alice", "Toyota Corolla", 5);
        CarRental rental3 = new CarRental("Bob", "Honda Civic", 3);

        rental1.displayRentalDetails(); 
        rental2.displayRentalDetails(); 
        rental3.displayRentalDetails(); 
    }
}
