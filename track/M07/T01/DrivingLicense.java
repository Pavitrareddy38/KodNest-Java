
import java.util.Scanner;

class DrivingLicense {

    int age;

    void takeUserAge() {
        System.out.println("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
    }

    void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            // UnderAgeException uae = new UnderAgeException();
            // throw uae;
            throw new UnderAgeException();

        } else if (age > 65) {
            throw new OverAgeException();
        } else {
            System.out.println("Driving license is issued...");
        }
    }

}
