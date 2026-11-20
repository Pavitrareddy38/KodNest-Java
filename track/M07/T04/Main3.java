
class Main3 {

    public static void main(String[] args) {
        Hospital1 h = new Hospital1();
        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);
        t1.setName("TOM");
        t2.setName("JERRY");
        t1.start();
        t2.start();

    }
}
