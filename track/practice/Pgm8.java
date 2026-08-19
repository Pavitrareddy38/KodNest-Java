
import java.util.Scanner;

public class Pgm8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size 1 and 2");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[][] a = new int[c][d];

        System.out.println("enter the elements of array ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j <= d - 1; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < d; i++) {
            int total = 0;
            for (int j = 0; j < c; j++) {
                total = total + a[j][i];
            }
            System.out.println("Day " + (i + 1) + "total: " + total);
        }

    }
}
