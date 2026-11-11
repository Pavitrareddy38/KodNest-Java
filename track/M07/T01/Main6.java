
import java.util.*;

public class Main6 {

    public static void main(String[] args) throws Exception {
        System.out.println("Main method execution started...");
        divide();
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
