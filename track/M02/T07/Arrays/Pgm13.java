
import java.util.Scanner;

public class Pgm13 {

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
        System.out.println();
        int key = scan.nextInt();
        boolean found = false;
        for (int i = 0; i <= size - 1; i++) {
            if (a[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        System.out.print("Reverse order: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }

    }
}
