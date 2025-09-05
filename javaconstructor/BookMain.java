package javaconstructor;
public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();

        Book b2 = new Book("The Alchemist", "Paulo Coelho", 499.0);

        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
