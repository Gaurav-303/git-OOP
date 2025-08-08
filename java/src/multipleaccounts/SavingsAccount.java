package multipleaccounts;


public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04; // 4% annually

    public SavingsAccount(Customer customer, double initialBalance) {
        super(customer, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient funds in Savings Account.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Savings Interest added: ₹" + interest);
    }
}

