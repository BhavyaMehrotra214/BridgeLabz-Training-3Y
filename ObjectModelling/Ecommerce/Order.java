package Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int counter = 1;
    private int orderId;
    private Customer customer;
    private List<Product> products = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
        this.orderId = counter++;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added " + product.getName() + " to Order #" + orderId);
    }

    public void showOrderDetails() {
        System.out.println("\nOrder #" + orderId + " placed by " + customer.getName());
        System.out.println("Products:");
        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p);
            total += p.getPrice();
        }
        System.out.println("Total Amount: $" + total);
    }

    public int getOrderId() {
        return orderId;
    }
}
