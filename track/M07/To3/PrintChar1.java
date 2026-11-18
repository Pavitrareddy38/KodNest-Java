
class PrintChar1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing characters is started...");
        for (char c = 'A'; c <= 'I'; c++) {
            System.out.println("Character: " + c);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
