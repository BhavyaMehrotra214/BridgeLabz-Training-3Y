package javaconstructor;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; 


    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not Assigned";
        this.rentalDays = 0;
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName + 
                           ", Car Model: " + carModel + 
                           ", Days: " + rentalDays + 
                           ", Total Cost: $" + calculateTotalCost());
    }
}
