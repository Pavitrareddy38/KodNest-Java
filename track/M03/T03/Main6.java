
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int temp = a[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
        System.out.println("the elements are: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
