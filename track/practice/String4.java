
import java.util.Scanner;

public class String4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean res = false;
        if (s1.length() != s2.length()) {
            System.out.println("Not a rotation");
        } else {
            for (int i = 0; i <= s1.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i + 1)) {
                    res = true;

                }

            }
            if (res) {
                System.out.println("rotation");
            }
        }
    }
}
