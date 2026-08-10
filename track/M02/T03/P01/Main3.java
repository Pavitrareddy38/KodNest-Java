
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String fullName = sc.nextLine();
        System.out.println("Enter number of Practice Days: ");
        int days = sc.nextInt();
        System.out.println("Enter number of days solved: ");
        int daysSolved = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= days; i++) {
            total = total + daysSolved;
        }
        double avg = (double) total / days;
        System.out.println("Learner: " + fullName);
        System.out.println("Average Solved: " + avg);
        System.out.println("Total Solved: " + total);
        if (avg >= 5.0) {
            System.out.println("Status: Consistent");
        } else {
            System.out.println("Status: Needs more consistnece");
        }
        sc.close();

    }
}
