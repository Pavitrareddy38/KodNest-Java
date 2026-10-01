
import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String r = " ";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (r.indexOf(ch) == -1) {
                r = r + ch;
            }
        }
        System.out.println(r);
    }
}
