
class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    double add(int a, double b, double c) {
        return a + b + c;
    }

}

public class AddApp {

    public static void main(String[] args) {
        Addition al = new Addition();
        int res1 = al.add(10, 20);
        double res = al.add(10, 10.5);
        System.out.println(res1);
        System.out.println(res);
    }
}
