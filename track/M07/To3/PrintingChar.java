
class PrintingChar extends Thread {

    @Override
    public void run() {
        System.out.println("Printing Characters is Started...");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing Characters is Completed...");
    }
}
