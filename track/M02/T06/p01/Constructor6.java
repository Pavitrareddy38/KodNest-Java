
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("planName: " + planName);
        System.out.println("price: " + price);
    }
}

public class Constructor6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the planame");
        String planName = sc.nextLine();
        System.out.println("Enter the price");
        int price = sc.nextInt();
        MobilePlan m = new MobilePlan();
        m.display();
        MobilePlan m1 = new MobilePlan(planName, price);
        m1.display();

        sc.close();
    }
}
