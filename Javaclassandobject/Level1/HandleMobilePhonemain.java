package Javaclassandobject.Level1;

public class HandleMobilePhonemain {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 120000);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S24", 95000);
        MobilePhone phone3 = new MobilePhone("OnePlus", "11R", 45000);

        phone1.displayDetails();
        phone2.displayDetails();
        phone3.displayDetails();
    }
}
