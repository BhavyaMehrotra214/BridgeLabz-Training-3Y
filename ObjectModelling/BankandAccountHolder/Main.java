public class Main {
    public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank.openAccount(c1, 5000);
        bank.openAccount(c1, 2000);
        bank.openAccount(c2, 10000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

}
