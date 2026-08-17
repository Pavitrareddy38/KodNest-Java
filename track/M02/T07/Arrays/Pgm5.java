
import java.util.Scanner;

public class Pgm5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length value: ");
        int n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i <= n - 1; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(" Array Elements are: ");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}
