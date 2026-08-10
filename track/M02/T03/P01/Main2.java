
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter monthly income: ");
        double income = sc.nextDouble();
        System.out.println("Enter rent");
        double rent = sc.nextDouble();
        System.out.println("Enter travel: ");
        double travel = sc.nextDouble();
        System.out.println("Enter food: ");
        double food = sc.nextDouble();
        double total = rent + food + travel;
        System.out.println("total: " + total);
        double balance = income - total;
        System.out.println("Remaining: " + balance);
        if (balance >= 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }
        sc.close();
    }
}
