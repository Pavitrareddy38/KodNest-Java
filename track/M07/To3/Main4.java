
public class Main4 {

    public static void main(String[] args) {
        System.out.println("Main Thread Execution is started and opened file....");
        Addition2 ad = new Addition2();
        PrintNum2 pn = new PrintNum2();
        PrintChar2 pc = new PrintChar2();
        ad.start();
        pn.start();
        pc.start();
        try {
            ad.join();
            pn.join();
            pc.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Execution is ended and closed file....");
    }
}
