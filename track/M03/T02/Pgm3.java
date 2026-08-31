
import java.util.Scanner;

public class Pgm3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int sorted = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                sorted = 0;
                break;
            }

        }
        System.out.println(sorted);
        sc.close();
    }
}
