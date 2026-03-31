class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class Bank {
    private double balance;

    void deposit(double amount) throws InsufficientBalanceException {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new InsufficientBalanceException("Amount cannot be zero or negative");
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (balance < amount) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class ThrowsException {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            bank.deposit(100);
            bank.withdraw(300);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        bank.checkBalance();
    }
}