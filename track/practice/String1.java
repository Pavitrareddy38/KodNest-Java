
import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char res = ' ';
        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                res = str.charAt(i);
                break;
            }

        }
        System.out.println(res);

    }
}
