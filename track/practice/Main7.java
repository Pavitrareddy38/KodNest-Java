
import java.util.Scanner;

class DeliveryCalculator {

    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}

public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance:");
        int distance = sc.nextInt();
        System.out.println("Enter expressfee:");
        int expressFee = sc.nextInt();

        DeliveryCalculator d = new DeliveryCalculator();
        int res = d.calculateCharge(distance);
        int res1 = d.calculateCharge(distance, expressFee);
        System.out.println("Standard Charge: " + res);
        System.out.println("Express Charge: " + res1);
        sc.close();
    }
}
