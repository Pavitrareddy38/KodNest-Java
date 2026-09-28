
import java.util.Scanner;

public class LearnerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        Learner learner = new Learner();
        learner.setAge(age);

        System.out.println(learner.getAge());
    }
}
