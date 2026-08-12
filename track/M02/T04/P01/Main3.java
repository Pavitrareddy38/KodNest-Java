
import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;

}

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Learner l1 = new Learner();
        System.out.println("Enter learner id: ");
        l1.id = sc.nextInt();
        System.out.println("Enter learner name: ");
        l1.name = sc.next();
        System.out.println("Enter learner java score: ");
        l1.javaScore = sc.nextInt();
        Learner l2 = new Learner();
        System.out.println("Enter second learner id: ");
        l2.id = sc.nextInt();
        System.out.println("Enter second learner name: ");
        l2.name = sc.next();
        System.out.println("Enter second learner java score: ");
        l2.javaScore = sc.nextInt();
        System.out.println("Enter new java score: ");
        int javaScore1 = sc.nextInt();
        System.out.println("Before Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);
        System.out.println("After Update");
        System.out.println(l1.id + " - " + l1.name + " - " + javaScore1);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);
        sc.close();
    }
}
