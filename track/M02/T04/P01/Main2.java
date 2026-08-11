
import java.util.Scanner;

class Student {

    int id;
    String name;
    int javaScore;
}

class SecondStudent {

    int id;
    String name;
    int javaScore;
}

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        SecondStudent s2 = new SecondStudent();
        System.out.println("Enter studenet id: ");
        s1.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter studenet name: ");
        s1.name = sc.nextLine();
        System.out.println("Enter studenet java score: ");
        s1.javaScore = sc.nextInt();
        System.out.println("Enter second studenet id: ");
        s2.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second studenet name: ");
        s2.name = sc.nextLine();
        System.out.println("Enter second studenet java score: ");
        s2.javaScore = sc.nextInt();
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);
        if (s1.javaScore > s2.javaScore) {
            System.out.println(s1.name + "chas the higher Java score");
        } else if (s1.javaScore < s2.javaScore) {
            System.out.println(s2.name + " has the hiher Java score");
        } else {
            System.out.println("Both students have the same Java score");
        }

        sc.close();

    }
}
