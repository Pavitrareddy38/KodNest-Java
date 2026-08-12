
import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharges) {
        return subtotal + deliveryCharges;
    }
}

public class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price,quantity:");
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        System.out.println("Enter delivery charges: ");
        int deliveryCharges = sc.nextInt();
        OrderCalculator o = new OrderCalculator();
        int res = o.calculateSubtotal(price, quantity);
        int res1 = o.calculateFinalTotal(res, deliveryCharges);
        System.out.println("Subtotal: " + res);
        System.out.println("Final Total: " + res1);
        sc.close();
    }
}
