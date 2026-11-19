
import java.util.Scanner;

class Addition2 extends Thread {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition activity is started and using the open file...");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a + b;
        System.out.println("Addition result is: " + res);
        System.out.println("Addition activity is completed and stoped using open file...");
        sc.close();
    }
}
