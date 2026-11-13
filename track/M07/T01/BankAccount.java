
public class BankAccount {

    String name;
    int num;
    double balance;

    public BankAccount(String name, int num, double balance) {
        this.name = name;
        this.num = num;
        this.balance = balance;
    }

    void deposit(double amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Deposit successfull");
        }
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn successfull");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
