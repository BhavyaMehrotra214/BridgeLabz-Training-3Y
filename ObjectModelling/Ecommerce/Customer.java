package Ecommerce;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Order placeOrder() {
        Order order = new Order(this);
        orders.add(order);
        System.out.println(name + " placed Order #" + order.getOrderId());
        return order;
    }

    public void showMyOrders() {
        System.out.println("\nOrders placed by " + name + ":");
        for (Order o : orders) {
            System.out.println(" - Order #" + o.getOrderId());
        }
    }
}