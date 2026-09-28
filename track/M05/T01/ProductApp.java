
import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();

        // Read price
        Product p = new Product(price);

        // Print the price through the getter
        System.out.println(p.getPrice());
    }
}
