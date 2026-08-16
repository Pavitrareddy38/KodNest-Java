
import java.util.Scanner;

class Employee {

    String name;
    String role;

    public Employee() {
        role = "Trainee";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }

}

public class Main10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        Employee e1 = new Employee();
        e1.name = name;
        e1.display();
        s.close();
    }
}
