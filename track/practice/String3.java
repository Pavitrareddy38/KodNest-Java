
import java.util.Scanner;

public class String3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int c1 = 0;
        int c2 = 0;
        if (s1.length() != s2.length()) {
            System.out.println("Not a anagrams");
        } else {
            for (int i = 0; i < s1.length(); i++) {

                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s1.charAt(j)) {
                        c1++;
                    }
                    if (s2.charAt(i) == s2.charAt(j)) {
                        c2++;
                    }
                }
            }
            if (c1 != c2) {
                System.out.println("Not a anagrams");
            } else {
                System.out.println("Anagrams");
            }
        }
    }
}
