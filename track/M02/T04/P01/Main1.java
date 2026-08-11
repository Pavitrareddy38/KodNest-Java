import java.util.Scanner;
public class Student{
    int id;
    String name;
    String course;
    double javaScore;
}
public class Main1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter studenet id: ");
        s.id=sc.nextInt();
        System.out.println("Enter studenet name: ");
        s.name=sc.next();
        System.out.println("Enter studenet course: ");
        s.course=sc.next();
        System.out.println("Enter studenet java score: ");
        s.javaScore=sc.nextDouble();
        System.out.println("Student Profile");
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Course: " + s.course);
        System.out.println("Java Score: " + s.javaScore);


        sc.close();

    } 
}
    