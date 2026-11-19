
import java.util.Scanner;

class Activity extends Thread {

    @Override
    public void run() {
        String t = Thread.currentThread().getName();
        if (t.equals("ADD")) {
            addition();
        } else if (t.equals("CHAR")) {
            character();
        } else {
            number();
        }
    }

    void addition() {
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

    void character() {
        System.out.println("Printing characters activity is started and using open file...");
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Printing Character is :" + c);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void number() {
        System.out.println("Printing numbers activity is started and using open file...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing Number is :" + i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing numbers activity is completed and stoped using open file...");
    }

}
