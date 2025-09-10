package FinalKeywordsAndInstanceOperator;
public class BookMain {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book b1 = new Book("ISBN001", "Java Programming", "James Gosling");
        Book b2 = new Book("ISBN002", "Clean Code", "Robert C. Martin");

        b1.displayDetails();
        b2.displayDetails();
    }
}