
import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte a = sc.nextByte();
        System.out.println("Byte value is:" + a);
        System.out.println("Enter a short value: ");
        short s = sc.nextShort();
        System.out.println("Short value is:" + s);
        System.out.println("Enter a int value: ");
        int i = sc.nextInt();
        System.out.println("Int value is:" + i);
        System.out.println("Enter a long value: ");
        long l = sc.nextLong();
        System.out.println("Long value is:" + l);
        System.out.println("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.println("Float value is:" + f);
        System.out.println("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.println("Double value is:" + d);
        System.out.println("Enter a boolean value: ");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean value is" + b);
    }
}
