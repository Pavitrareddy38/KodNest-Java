
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("Employee id: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

}

public class Main11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        s.nextLine();
        String name = s.nextLine();
        String dep = s.next();
        Employee e = new Employee(id, name, dep);
        e.display();
        s.close();
    }
}
