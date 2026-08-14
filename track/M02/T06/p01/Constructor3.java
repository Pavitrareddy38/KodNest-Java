
import java.util.Scanner;

class Product {

    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product price: " + price);
    }
}

public class Constructor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter product name,price");
        Product p = new Product(sc.nextLine(), sc.nextDouble());
        p.display();
        sc.close();

    }
}
