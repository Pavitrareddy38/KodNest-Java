
import java.util.Scanner;

public class Pgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int count = 0;
        double avg = (double) sum / n;
        for (int i : arr) {
            if (i > avg) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
