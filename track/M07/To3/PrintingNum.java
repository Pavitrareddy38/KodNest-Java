
class PrintingNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing Numbers is Started...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Printing Numbers is Completed...");
    }
}
