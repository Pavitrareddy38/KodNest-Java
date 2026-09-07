
import java.util.Scanner;

public class PrefixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elemets");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long p[] = new long[n];
        for (int i = 0; i < n; i++) {
            p[i] = a[i];
        }
        p[0] = a[0];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            p[i] = sum;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(p[i] + " ");
        }

    }
}
