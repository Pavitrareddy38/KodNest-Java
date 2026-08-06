
public class Break3 {

    public static void main(String[] args) {
        Outer:
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 4; j++) {
                if (i == 2) {
                    break inner;
                }
                System.out.println("i: " + i + " " + "j: " + j);
            }
        }
    }
}
