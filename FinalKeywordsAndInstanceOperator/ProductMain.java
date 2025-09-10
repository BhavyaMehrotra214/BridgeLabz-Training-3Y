package FinalKeywordsAndInstanceOperator;

public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 800.0, 1);
        Product p2 = new Product(2, "Headphones", 50.0, 2);

        p1.displayDetails();
        p2.displayDetails();


        Product.updateDiscount(20.0);

        p1.displayDetails();
        p2.displayDetails();
    }
}