
import java.util.Scanner;

public class Pgm6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] original = {14, 18, 22, 26};
        int updatedIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;
        int[] snapshot = new int[original.length];
        for (int i = 0; i < original.length - 1; i++) {
            snapshot[i] = original[i];
        }
        int[] lineView = original;
        if (updatedIndex >= 0 && updatedIndex <= lineView.length - 1) {
            lineView[updatedIndex] = updatedValue;
        }
        System.out.print("Original: ");
        for (int i = 0; i <= original.length - 1; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.print("\nSnapshot: ");
        for (int i = 0; i <= original.length - 1; i++) {
            System.out.print(snapshot[i] + " ");
        }
        if (original == lineView) {
            System.out.print("\nSame object: true");
        }

        if (requestedIndex >= 0 && requestedIndex <= original.length - 1) {
            System.out.print("\nRequested Index: " + requestedIndex);
            System.out.print("\nRequested Element: " + original[requestedIndex]);
        } else {
            System.out.println("\nInvalid Index");
        }
    }
}
