
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("order: " + item);
        System.out.println("quantity: " + quantity);
    }
}

public class Constructor5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item name");
        String item = sc.nextLine();
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        FoodOrder f = new FoodOrder(item);
        f.display();
        FoodOrder f1 = new FoodOrder(item, quantity);
        f1.display();
        sc.close();
    }
}
