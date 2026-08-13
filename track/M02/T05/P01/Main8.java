
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + this.name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

public class Main8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter first: ");
        int first = sc.nextInt();
        System.out.println("Enter second: ");
        int second = sc.nextInt();
        Student s1 = new Student();
        s1.setName(name);
        s1.showName();
        s1.showScore(first);
        s1.showScore(first, second);
        sc.close();
    }
}
