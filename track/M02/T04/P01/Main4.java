
import java.util.Scanner;

class Student {

    int registrationId;
    String name;
    double attendancePercentage;
}

public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter registration id: ");
        s.registrationId = sc.nextInt();
        System.out.println("Enter name: ");
        s.name = sc.next();
        System.out.println("Enter attendance percentage: ");
        s.attendancePercentage = sc.nextDouble();
        Student s1 = new Student();
        System.out.println("Enter registration id: ");
        s1.registrationId = sc.nextInt();
        System.out.println("Enter name: ");
        s1.name = sc.next();
        System.out.println("Enter attendance percentage: ");
        s1.attendancePercentage = sc.nextDouble();
        Student selected = null;
        System.out.println("Enter registration id and attendance percentage of selected student: ");
        int student = sc.nextInt();
        double attendancePercentage = sc.nextDouble();
        if (student == s.registrationId) {
            System.out.println("Selected student: " + s.name);
            System.out.println(s.registrationId + " - " + s.name + " - " + attendancePercentage + "%");
            System.out.println(s1.registrationId + " - " + s1.name + " - " + s.attendancePercentage + "%");
        } else if (student == s1.registrationId) {

            System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
            System.out.println(s.registrationId + " - " + s.name + " - " + attendancePercentage + "%");

        } else {
            System.out.println("Student not found");

            System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");
            System.out.println(s.registrationId + " - " + s.name + " - " + s.attendancePercentage + "%");
        }
        sc.close();
    }
}
