
import java.util.Scanner;

public class Main15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = s.nextInt();
        int[] planned = new int[n];
        int[] completed = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            planned[i] = s.nextInt();
            completed[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (planned[i] > completed[i]) {
                System.out.println("Day " + (i + 1) + ":" + "Completed");
                count++;
            } else {
                System.out.println("Day " + (i + 1) + ":" + "Pending");
            }
        }
        System.out.println(count);

    }
}
