
public class DLApp {

    public static void main(String[] args) {
        DrivingLicense d = new DrivingLicense();
        d.takeUserAge();
        try {
            d.verify();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Handled");
        }

    }
}
