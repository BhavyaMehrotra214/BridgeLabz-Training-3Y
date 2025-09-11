package Ecommerce;

public class ECommerceMain {
    public static void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 750.00);
        Product phone = new Product("Smartphone", 500.00);
        Product headphones = new Product("Headphones", 80.00);

        // Create customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Customers place orders
        Order order1 = alice.placeOrder();
        order1.addProduct(laptop);
        order1.addProduct(headphones);

        Order order2 = bob.placeOrder();
        order2.addProduct(phone);


        order1.showOrderDetails();
        order2.showOrderDetails();

        alice.showMyOrders();
        bob.showMyOrders();
    }
}
