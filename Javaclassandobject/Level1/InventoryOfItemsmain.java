package Javaclassandobject.Level1;

public class InventoryOfItemsmain {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 55000);

        item1.displayDetails();

        int quantity = 2;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item1.calculateTotalCost(quantity));
    }
}
