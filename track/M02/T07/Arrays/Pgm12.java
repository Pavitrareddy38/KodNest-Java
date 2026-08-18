
public class Pgm12 {

    public static void main(String[] args) {
        int a[] = {12, 14, 16, 18};
        int update = 2;
        int newValue = 25;
        int[] snapshot = new int[a.length];
        for (int i = 0; i <= snapshot.length - 1; i++) {
            snapshot[i] = a[i];
        }
        System.out.print("Snapshot: ");
        for (int i = 0; i <= snapshot.length - 1; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();
        snapshot[update] = newValue;
        System.out.print("Updated: ");
        for (int i = 0; i <= snapshot.length - 1; i++) {
            System.out.print(snapshot[i] + " ");
        }
    }

}
