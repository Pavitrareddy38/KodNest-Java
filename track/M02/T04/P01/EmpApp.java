
import java.util.Scanner;

class Employee {

    String name;
    int id;

    void work() {
        System.out.println("Working");
    }

}

public class EmpApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("Enter name");
        e1.name = sc.next();
        System.out.println("Enter id");
        e1.id = sc.nextInt();
        System.out.println(e1.name);
        System.out.println(e1.id);
        e1.work();
        Employee e2;
        e2 = e1;
        e2.id = 12;
        e2.name = "Raju";
        System.out.println(e1.name);
        System.out.println(e1.id);
        System.out.println(e2.name);
        System.out.println(e2.id);
        e2.work();
        sc.close();
    }
}
