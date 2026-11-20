
public class Main1 {

    public static void main(String[] args) {
        Printer p1 = new Printer();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(p1);

        t1.setName("Java Developer");
        t2.setName("Python Developer");
        t3.setName("C Developer");
        t1.start();
        t2.start();
        t3.start();
    }
}
