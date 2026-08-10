
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start value: ");
        int start = sc.nextInt();
        System.out.println("Enter end value: ");
        int end = sc.nextInt();
        int evenSum = 0;
        int oddCount = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddCount += 1;
            }
        }
        System.out.println(evenSum);

        System.out.println(oddCount);

        sc.close();

    }
}
