// 5. BankAccount and SavingsAccount Override
class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". Current Balance: $" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Current Balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed! Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        // Prevent withdrawal if balance falls below 100
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied! Balance cannot fall below $100. Current Balance: $" + balance);
        } else {
            super.withdraw(amount);
        }
    }
}

public class SavingsAccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(150.0);

        sa.deposit(50.0);   // Balance: $200.0
        sa.withdraw(80.0);  // Balance: $120.0
        sa.withdraw(50.0);  // Denied (120 - 50 = 70 < 100)
    }
}
