
class PrintChar2 extends Thread {

    @Override
    public void run() {
        System.out.println("Printing characters activity is started and using open file...");
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Printing Character is :" + c);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing characters activity is completed and stoped using open file...");
    }
}
