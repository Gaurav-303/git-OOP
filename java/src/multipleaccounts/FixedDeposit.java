package multipleaccounts;

public class FixedDeposit extends Account {
    private static final double INTEREST_RATE = 0.07; // 7% annually
    private int years;

    public FixedDeposit(Customer customer, double initialBalance, int years) {
        super(customer, initialBalance);
        this.years = years;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed until maturity.");
    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE * years;
        balance += interest;
        System.out.println("FD Interest after " + years + " years: ₹" + interest);
    }
}
