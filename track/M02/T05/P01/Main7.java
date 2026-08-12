
import java.util.Scanner;

class Calculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class Main7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        Calculator cl = new Calculator();
        int res = cl.getTotal(first, second);
        int res1 = cl.getTotal(first, second, third);
        System.out.println("Two - Mark Total :" + res);
        System.out.println("Three - mark Total :" + res1);

        sc.close();
    }
}
