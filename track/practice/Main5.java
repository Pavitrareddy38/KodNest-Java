
import java.util.Scanner;

class Learner {

    String name;
    int completedLessons;
    int totalLessons;
    int progress;
}

public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Learner l1 = new Learner();
        System.out.println("Enter name");
        l1.name = sc.next();
        System.out.println("Enter completed lessons");
        l1.completedLessons = sc.nextInt();
        System.out.println("Enter total lessons");
        l1.totalLessons = sc.nextInt();
        l1.progress = (l1.completedLessons / l1.totalLessons) * 100;
        System.out.println("Student: " + l1.name);
        System.out.println("Progress: " + l1.completedLessons + "/" + l1.totalLessons);
        System.out.println("completion: " + l1.progress + "%");
        sc.close();
    }
}
