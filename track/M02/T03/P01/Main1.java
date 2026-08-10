
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Practice Days: ");
        int days = sc.nextInt();
        System.out.println("Enter number of days solved: ");
        int daysSolved = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= days; i++) {
            total = total + daysSolved;
        }
        System.out.println("Total Solved: " + total);
        if (total >= 20) {
            System.out.println("Status: Strong Progress");
        } else if (total >= 10) {
            System.out.println("Status: keep practicing");
        } else {
            System.out.println("Status: Needs more practice");
        }
        sc.close();

    }
}
