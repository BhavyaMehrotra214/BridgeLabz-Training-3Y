import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;  

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayLibrary() {
        System.out.println("\nLibrary: " + name);
        System.out.println("Books in this library:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}
