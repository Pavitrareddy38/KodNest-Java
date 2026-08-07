
import java.util.Scanner;

public class Userinput1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your full name ");
        String a = s.nextLine();
        System.out.println(a);
        System.out.println("Enter your country: ");
        String b = s.next();//this cant print after the space it will only print one word
        System.out.println(b);
        s.nextLine();//if we give the nextline input between and last we need to add another scanner.nextLine before that input
        System.out.println("Enter your city");
        String c = s.nextLine();
        System.out.println(c);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        System.out.println(age);
        System.out.println("Enter your height ");
        float height = s.nextFloat();
        System.out.println(height);

    }
}
