
import java.util.Scanner;

public class Pgm4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size 1 and 2");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int[][] a = new int[s1][s2];

        System.out.println("enter the elements of array ");
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int count = 0;
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                if (a[i][j] == 0) {
                    count++;
                }
            }
        }
        System.out.println("Available seats:  " + count);

    }
}
