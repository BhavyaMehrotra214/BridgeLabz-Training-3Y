package AcessModifiers;


public class LibrarySystemMain {
    public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayDetails();


        System.out.println("Author: " + b1.getAuthor());
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + b1.getAuthor());

        System.out.println();

        EBook eb = new EBook("978-0135166307", "Java Concurrency in Practice", "Brian Goetz", 5.6);
        eb.showEBookDetails();
    }
}
