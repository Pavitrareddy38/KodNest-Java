
import java.util.*;

public class Main16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Target: ");
        int target = sc.nextInt();
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("First Index: " + index);
        sc.close();
    }
}
