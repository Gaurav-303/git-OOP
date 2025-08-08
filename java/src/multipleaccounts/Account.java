package multipleaccounts;

public abstract class Account {
    private Customer customer;
    protected double balance;

    public Account(Customer customer, double initialBalance) {
        this.customer = customer;
        this.balance = initialBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public abstract void withdraw(double amount);
    public abstract void calculateInterest();
}
