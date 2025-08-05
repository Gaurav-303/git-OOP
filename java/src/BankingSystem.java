abstract class Account {
    String name;
    int accNo;
    double balance;

    Account(String name, int accNo) {
        this.name = name;
        this.accNo = accNo;
    }

    void deposit(double amt) {
        balance += amt;
    }

    abstract boolean withdraw(double amt);

    void printStatement() {
        System.out.println(name + " | Acc: " + accNo + " | Balance: ₹" + balance);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String name, int accNo) {
        super(name, accNo);
    }

    boolean withdraw(double amt) {
        if (balance - amt >= 1000) {
            balance -= amt;
            return true;
        }
        return false;
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String name, int accNo) {
        super(name, accNo);
    }

    boolean withdraw(double amt) {
        if (balance - amt >= -5000) {
            balance -= amt;
            return true;
        }
        return false;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount("Gauri", 101);
        Account a2 = new CurrentAccount("Gaurav", 102);

        a1.deposit(5000);
        a1.withdraw(4200);  // leaves ₹800 (should fail)
        a1.printStatement();

        a2.deposit(1000);
        a2.withdraw(4000);  // allowed due to overdraft
        a2.printStatement();
    }
}
