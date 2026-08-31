
import java.util.Scanner;

public class Pgm4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;
        if (n < 2) {
            System.out.println("No second largest distinct value");
        }
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(secondLargest);
        }
        sc.close();
    }
}
