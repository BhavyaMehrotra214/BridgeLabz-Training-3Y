package javaconstructor;


public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("Java Programming", "James Gosling", 499.99, true);
        LibraryBook book2 = new LibraryBook("Python Basics", "Guido van Rossum", 299.99, false);

        book1.displayDetails();
        book2.displayDetails();

        book1.borrowBook(); 
        book1.borrowBook(); 
        book2.borrowBook(); 
    }
}
