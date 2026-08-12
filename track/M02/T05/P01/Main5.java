
import java.util.Scanner;

class Employee {

    String name;
    double salary;

    void input(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}

public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();
        Employee e1 = new Employee();
        e1.input(name, salary);
        e1.display();
        sc.close();
    }
}
