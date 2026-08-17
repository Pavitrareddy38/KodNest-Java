
import java.util.Scanner;

public class Pgm8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length value: ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i <= n - 1; i++) {
            a[i] = s.nextInt();
        }
        int total = 0;
        System.out.println(" Array Elements are: ");
        for (int i = 0; i <= n - 1; i++) {
            total += a[i];
        }
        System.out.println("Total: " + total);
        s.close();
    }
}
