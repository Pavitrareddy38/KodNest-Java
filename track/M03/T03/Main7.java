
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        s.close();
    }
}
