package atmmachine;

public class Bank {
    private UserAccount[] accounts;

    public Bank() {
        accounts = new UserAccount[3]; // fixed size
        accounts[0] = new UserAccount(1001, 1234, 5000);
        accounts[1] = new UserAccount(1002, 2345, 3000);
        accounts[2] = new UserAccount(1003, 3456, 7000);
    }

    public UserAccount login(int accNo, int pin) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountNumber() == accNo && accounts[i].validatePIN(pin)) {
                return accounts[i];
            }
        }
        return null;
    }
}

