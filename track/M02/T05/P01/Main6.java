
import java.util.Scanner;

class Pointers {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        System.out.println("Enter word: ");
        String str = sc.next();
        Pointers pt = new Pointers();
        pt.show(num);
        pt.show(str);
        sc.close();

    }
}
