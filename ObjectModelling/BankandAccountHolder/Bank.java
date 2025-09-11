import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private List<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account newAcc = new Account(initialDeposit);
        customer.addAccount(newAcc);
        if (!customers.contains(customer)) {
            addCustomer(customer);
        }
        System.out.println("Bank: " + bankName +
                           " opened account " + newAcc.getAccountNumber() +
                           " for " + customer.getName());
    }
}
