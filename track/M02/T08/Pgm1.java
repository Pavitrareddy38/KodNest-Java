
import java.util.Scanner;

public class Pgm1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array elements: ");
        int r = s.nextInt();
        int c = s.nextInt();
        int a[][] = new int[r][c];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i <= r - 1; i++) {
            for (int j = 0; j <= c - 1; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Array elements are: ");
        for (int i = 0; i <= r - 1; i++) {
            for (int j = 0; j <= c - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
    }

}
