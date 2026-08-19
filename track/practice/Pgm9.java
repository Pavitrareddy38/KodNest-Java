
import java.util.Scanner;

public class Pgm9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int r = sc.nextInt();
        int[] a = new int[r];
        System.out.println("enter the target");
        int t = sc.nextInt();
        System.out.println("enter the replace value");
        int replace = sc.nextInt();

        System.out.println("enter the elements of array ");
        for (int i = 0; i < r; i++) {

            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < r; i++) {
            if (a[i] == t) {
                a[i] = replace;
                count++;

            }
        }
        System.out.println("count: " + count);
        for (int i = 0; i < r; i++) {
            System.out.print(a[i] + " ");

        }

    }
}
