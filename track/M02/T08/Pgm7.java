
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        int total = 0;
        for (int i = 0; i < size; i++) {
            total = total + a[i];
        }
        System.out.println("Array total: " + total);
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        int[][] b = new int[s1][s2];
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                b[i][j] = s.nextInt();
            }
        }
        int mtotal = 0;
        for (int i = 0; i < s1; i++) {
            for (int j = 0; j < s2; j++) {
                mtotal = mtotal + b[i][j];
            }
        }
        System.out.println("Matrix total: " + mtotal);
        s.close();
    }
}
