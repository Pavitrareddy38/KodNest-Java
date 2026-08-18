
import java.util.Scanner;

public class Pgm14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scan.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the array Elemennts: ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int count = 0;
        for (int i = 0; i <= size - 1; i++) {
            if (a[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency is " + target + ":" + count);
        scan.close();
    }
}
