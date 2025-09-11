public class Librarymain {
    public static void main(String[] args) {
        
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Sapiens", "Yuval Noah Harari");

    
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");
       
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2); 
        lib2.addBook(b3);

        
        lib1.displayLibrary();
        lib2.displayLibrary();
    }
}