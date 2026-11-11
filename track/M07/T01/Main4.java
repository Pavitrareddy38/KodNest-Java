
import java.util.Scanner;
public class Main4 {

    public static void main(String[] args) {
        System.out.println("Main method execution started....");
        try{
        division();
        }
        catch(Exception e){
            System.out.println("Exception handled in main method...");
        }
        System.out.println("Main method execution completed....");
    }
    static void division()
    {

        try {
            System.out.println("Division started...");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a/b;
            System.out.println("Result: " + res);
        }
        catch(Exception e){
            System.out.println("Exception handled in division method...");
            throw e;
        }
        finally{
        System.out.println("Division Completed...");
        }
    }
}
