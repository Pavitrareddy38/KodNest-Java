
import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the array Elemennts: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter the array Elemennts: ");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];

            }
        }
        System.out.println();
        System.out.println("Minimum Element is: " + min);
        System.out.println("Maximum Element is: " + max);
        scan.close();

    }

}
