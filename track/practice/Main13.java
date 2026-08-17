
import java.util.Scanner;

public class Main13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the string");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            a[i] = s.nextInt();
        }
        System.out.print("Reverse: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        s.close();
    }
}
