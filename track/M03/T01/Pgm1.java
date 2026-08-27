
import java.util.Scanner;

public class Pgm1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size ");
        int n = sc.nextInt();
        int num = sc.nextInt();
        int max = num;
        int min = num;
        for (int i = 1; i <= n; i++) {
            num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}
