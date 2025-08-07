package atmmachine;

import java.util.Scanner;

public class ATM {
    private Bank bank;

    public ATM(Bank bank) {
        this.bank = bank;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM!");

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        UserAccount user = bank.login(accNo, pin);

        if (user == null) {
            System.out.println("Invalid account number or PIN.");
            return;
        }

        while (true) {
            System.out.println("\n1. Check Balance\n2. Withdraw Cash\n3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + user.getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double amount = sc.nextDouble();
                    if (user.withdraw(amount)) {
                        System.out.println("Withdrawal successful.");
                        System.out.println("Remaining Balance: ₹" + user.getBalance());
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

