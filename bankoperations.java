import java.util.*;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

// Interface
interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException;
    void display();
}

// Abstract Class
abstract class Account implements BankOperations {
    protected int accNo;
    protected String holderName;
    protected double balance;
    protected List<String> transactions = new ArrayList<>();

    public Account(int accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: " + amount);
    }

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Transactions: " + transactions);
        System.out.println("---------------------------");
    }
}

// Savings Account
class SavingsAccount extends Account {
    private final double MIN_BALANCE = 1000;

    public SavingsAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < MIN_BALANCE)
            throw new InsufficientFundsException("Minimum balance must be maintained!");
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }
}

// Current Account
class CurrentAccount extends Account {
    private final double OVERDRAFT_LIMIT = 5000;

    public CurrentAccount(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount < -OVERDRAFT_LIMIT)
            throw new InsufficientFundsException("Overdraft limit exceeded!");
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
    }
}

public class BankingSystem {
    static HashMap<Integer, Account> bank = new HashMap<>();

    public static void transfer(int fromAcc, int toAcc, double amount) 
            throws InsufficientFundsException {
        Account sender = bank.get(fromAcc);
        Account receiver = bank.get(toAcc);

        if (sender == null || receiver == null) {
            System.out.println("Invalid account number!");
            return;
        }

        sender.withdraw(amount);
        receiver.deposit(amount);

        sender.transactions.add("Transferred to " + toAcc + ": " + amount);
        receiver.transactions.add("Received from " + fromAcc + ": " + amount);
    }

    public static void main(String[] args) {
        try {
            bank.put(101, new SavingsAccount(101, "Alice", 5000));
            bank.put(102, new CurrentAccount(102, "Bob", 2000));

            bank.get(101).deposit(1000);
            bank.get(102).withdraw(3000);
            transfer(101, 102, 1500);

            for (Account acc : bank.values()) {
                acc.display();
            }

        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}
