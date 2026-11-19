
public class Main6 {

    public static void main(String[] args) {
        Activity1 a1 = new Activity1();
         Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a1);
        Thread t3 = new Thread(a1);
        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NuM");

        t1.start();
        t2.start();
        t3.start();

    }
}
