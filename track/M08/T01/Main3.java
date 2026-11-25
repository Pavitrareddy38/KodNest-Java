
import java.util.ArrayList;
import java.util.Scanner;

class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String x = sc.next();
            names.add(x);
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        for (Object j : names) {
            System.out.println(j);
        }
        sc.close();
    }
}
