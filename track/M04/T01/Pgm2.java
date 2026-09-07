
import java.util.Scanner;

public class Pgm2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int vowelCount = 0;

        for (int i = 0; i <= text.length() - 1; i++) {
            char ch = Character.toLowerCase(text.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
        scanner.close();
    }
}
