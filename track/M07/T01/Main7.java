
import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("The entered number is : " + a);
        }
    }
}
