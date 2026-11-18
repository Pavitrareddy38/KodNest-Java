
class Main3 {

    public static void main(String[] args) {
        // Addition1 ad = new Addition1();
        // PrintNum1 pn = new PrintNum1();
        // PrintChar1 pc = new PrintChar1();
        // Thread t1 = new Thread(ad);
        // Thread t2 = new Thread(pn);
        // 
        new Thread(new Addition1()).start();
        new Thread(new PrintNum1()).start();
        new Thread(new PrintChar1()).start();
        // t1.start();
        // t2.start();
        // t3.start();

    }
}
