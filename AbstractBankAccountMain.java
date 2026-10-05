// 8. Abstract BankAccount
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Savings] Deposited $" + amount + ". Balance: $" + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println("[Savings] Withdrew $" + amount + ". Balance: $" + balance);
        } else {
            System.out.println("[Savings] Withdrawal failed! Must maintain minimum $100 balance.");
        }
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit = 500.0;

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Current] Deposited $" + amount + ". Balance: $" + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("[Current] Withdrew $" + amount + ". Balance: $" + balance);
        } else {
            System.out.println("[Current] Withdrawal failed! Exceeds overdraft limit.");
        }
    }
}

public class AbstractBankAccountMain {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(200.0);
        BankAccount current = new CurrentAccount(100.0);

        savings.deposit(50.0);
        savings.withdraw(180.0); // Fails (maintains $100 min)

        current.withdraw(400.0); // Succeeds with overdraft
    }
}
