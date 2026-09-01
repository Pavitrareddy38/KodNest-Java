
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[a.length + 1];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        System.out.println("Enter the element to be added: ");
        int element = sc.nextInt();
        b[index] = element;
        for (int i = index; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        System.out.println("the elements are: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
