package multipleaccounts;

public class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(Customer customer, double initialBalance) {
        super(customer, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + OVERDRAFT_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Account: No interest.");
    }
}
