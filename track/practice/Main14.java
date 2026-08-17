
import java.util.Scanner;

public class Main14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the string");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            a[i] = s.nextInt();
        }
        int correct = s.nextInt();
        int newScore = s.nextInt();
        Score s1 = new Score();
        s1.correctScore(a, correct, newScore);
        s1.display(a);
    }
}
