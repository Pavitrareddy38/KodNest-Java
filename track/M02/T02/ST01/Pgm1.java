
public class Pgm1 {

    public static void main(String[] args) {
        int num = -17;
        int firstScore = 18;
        int secondScore;
        secondScore = 25;
        if (num > 0) {
            System.err.println("Number type: Positive");
        } else if (num < 0) {
            System.err.println("Number type: Negative");
        } else {
            System.out.println("Number type: Zero");
        }

        if (num % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        if (firstScore >= secondScore) {
            System.out.println("Largest score: " + firstScore);
        } else {
            System.out.println("Largest score: " + secondScore);
        }
    }
}
