package AcessModifiers;


class EBook extends Book {
    private double fileSize; 

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }
    public void showEBookDetails() {
        System.out.println("E-Book ISBN: " + ISBN);   
        System.out.println("E-Book Title: " + title); 
        System.out.println("File Size: " + fileSize + " MB");
    }
}
