
import java.util.*;

public class Main5 {

    public static void main(String[] args) {
        System.out.println("Main method execution started...");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception handled in main...");
        }

        System.out.println("Main method execution completed...");
    }

    static void divide() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = a / b;
        System.out.println("Result: " + res);
    }
}
