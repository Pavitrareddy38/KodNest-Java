
import java.util.Scanner;

class Practice {

    int id;
}

public class Main9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice p1 = new Practice();
        System.out.println("Enter the id: ");
        p1.id = sc.nextInt();
        Practice p2 = new Practice();
        System.out.println("Enter the id: ");
        p2.id = sc.nextInt();
        Practice p3 = new Practice();
        System.out.println("Enter the id: ");
        p3.id = sc.nextInt();
        int unreachable = p1.id;
        p1 = p2;
        p2 = p3;
        p3 = p1;
        int relay = p2.id;

        System.out.println("First Reference: " + p1.id);
        System.out.println("SecondReference: " + p2.id);
        System.out.println("third reference: " + p3.id);
        System.out.println("relay: " + relay);
        System.out.println("unreachable: " + unreachable);
        sc.close();
    }
}
