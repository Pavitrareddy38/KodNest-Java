
class Score {

    void correctScore(int a[], int index, int newScore) {
        if (index >= 0 && index < a.length) {
            a[index] = newScore;
        } else {
            System.out.println("Invalid Index");
        }
    }

    void display(int[] a) {
        System.out.print("Scores:");
        for (int val : a) {
            System.out.print(" " + val);
        }
        System.out.println();
    }

}
