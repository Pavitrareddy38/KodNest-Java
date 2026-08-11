
import java.util.Scanner;

class StudentUtility {

    void showRoportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
    }

    double getPassagePercentage() {
        return 60.0;
    }

    double add(int a, int b) {
        double java = a;
        double sql = b;
        return (java + sql) / 2;
    }
}

public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        StudentUtility su = new StudentUtility();
        su.showRoportTitle();
        su.displayStudent(id, name);
        double res = su.getPassagePercentage();
        double result = su.add(a, b);
        System.out.println("Percentage: " + result);
        if (result > res) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
        sc.close();
    }
}
