
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Connection Establidhed");
        try {
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Exception Handled");
            System.out.println(e.getMessage());
        }
        System.out.println("Connection Terminated");
        sc.close();
    }
}
