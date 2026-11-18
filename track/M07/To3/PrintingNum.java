
class PrintingNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing Numbers is Started...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Printing Numbers is Completed...");
    }
}
