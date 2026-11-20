
public class Printer implements Runnable {

    @Override
    synchronized public void run() {
        try {
            String tn = Thread.currentThread().getName();
            System.out.println(tn + " is started using printer...");
            Thread.sleep(3000);
            System.out.println(tn + " is using the printer...");
            Thread.sleep(3000);
            System.out.println(tn + " is stopped using the printer...");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
