
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from the method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int a, int b) {
        return a + b;
    }
}

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        MethodDemo md = new MethodDemo();
        md.sayHello();
        md.greet(name);
        int res = md.getLuckyNumber();
        System.out.println("Lucky Number: " + res);
        int result = md.add(a, b);
        System.out.println("Sum: " + result);
        sc.close();
    }
}
