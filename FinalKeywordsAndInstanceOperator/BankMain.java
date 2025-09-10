package FinalKeywordsAndInstanceOperator;

public class BankMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice", 5000.0);
        BankAccount acc2 = new BankAccount(1002, "Bob", 3000.0);

        acc1.displayDetails();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}