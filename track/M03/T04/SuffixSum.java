
import java.util.Scanner;

public class SuffixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elemets");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long s[] = new long[n];

        long sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += a[i];
            s[i] = sum;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(s[i] + " ");
        }

    }
}
