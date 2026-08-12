
import java.util.Scanner;

class Student {

    String name;
    int age;
    double height;

    void input(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("height: " + this.height);
    }
}

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter height");
        double height = sc.nextDouble();
        Student s1 = new Student();
        s1.input(name, age, height);
        s1.display();
        sc.close();
    }
}
