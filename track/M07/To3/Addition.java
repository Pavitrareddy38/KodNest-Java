import java.util.Scanner;
class Addition extends Thread {
    @Override
    public void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition is Started...");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a + b;
        System.out.println("Addition result: " + res);
        System.out.println("Addition is Completed...");
        

    }
}