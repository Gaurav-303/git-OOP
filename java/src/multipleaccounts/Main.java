package multipleaccounts;
    public class Main {
        public static void main(String[] args) {
            Customer cust1 = new Customer("Gaurav Mishra", "C001");

            Account savings = new SavingsAccount(cust1, 10000);
            Account current = new CurrentAccount(cust1, 5000);
            Account fd = new FixedDeposit(cust1, 20000, 3);

            // Demonstrating polymorphism
            System.out.println("\n--- Savings Account ---");
            savings.deposit(2000);
            savings.withdraw(5000);
            savings.calculateInterest();

            System.out.println("\n--- Current Account ---");
            current.withdraw(9000);
            current.calculateInterest();

            System.out.println("\n--- Fixed Deposit ---");
            fd.calculateInterest();
            fd.withdraw(1000);

            System.out.println("\nFinal Balances:");
            System.out.println("Savings: ₹" + savings.getBalance());
            System.out.println("Current: ₹" + current.getBalance());
            System.out.println("FD: ₹" + fd.getBalance());
        }
    }

