
import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Constructor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student(sc.nextLine());
        s.display();
        sc.close();

    }
}
