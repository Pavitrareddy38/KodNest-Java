
import java.util.Scanner;

class CarBooking {

    String name;
    String cabType;
    int distance;
    int fare;

    public CarBooking(String name) {
        this.name = name;
        cabType = "mini";
        distance = 5;
        fare = 75;
    }

    public CarBooking(String name, String cabType, int distance) {
        this.name = name;
        this.cabType = cabType;
        this.distance = distance;
        fare = distance * 15;
    }

    void display() {
        System.out.println("name :" + name);
        System.out.println("cab type :" + cabType);
        System.out.println("distance :" + distance);
        System.out.println("fare :" + fare);
    }

}

public class Main12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the name");
        String name = s.nextLine();

        System.out.println("enter the cab type");
        String cabType = s.next();

        System.out.println("enter the distance");
        int distance = s.nextInt();

        int choice = s.nextInt();
        if (choice == 1) {
            CarBooking c1 = new CarBooking(name);
            c1.display();
        } else {
            CarBooking c = new CarBooking(name, cabType, distance);
            c.display();
        }

        s.close();

    }
}
