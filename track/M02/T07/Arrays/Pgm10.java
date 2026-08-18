
public class Pgm10 {

    public static void main(String[] args) {
        int[] a = {4, 12, 2, 9, 5};
        int reorderLevel = 5;
        int reorderCount = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] <= reorderLevel) {
                reorderCount++;
            }
        }
        System.out.println("Reoreder count:" + reorderCount);

    }

}
