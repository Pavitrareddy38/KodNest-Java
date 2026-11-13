
import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num = sc.nextInt();
        double balance = sc.nextInt();
        int ch = sc.nextInt();
        double amount = sc.nextDouble();
        BankAccount b = new BankAccount(name, num, balance);
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + num);

        if (ch == 1) {
            try {
                b.deposit(amount);
                b.checkBalance();
            } catch (InvalidAmountException e1) {
                System.out.println(e1.getMessage());

            } finally {
                System.out.println("Transaction Completed");
            }

        } else if (ch == 2) {
            try {
                b.withdraw(amount);
                b.checkBalance();
            } catch (InsufficientBalanceException e2) {
                System.out.println(e2.getMessage());
            } finally {
                System.out.println("Transaction Completed");
            }

        }

        sc.close();
    }
}
