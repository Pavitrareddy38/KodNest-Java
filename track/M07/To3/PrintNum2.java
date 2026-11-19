
class PrintNum2 extends Thread {

    @Override
    public void run() {
        System.out.println("Printing numbers activity is started and using open file...");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing Number is :" + i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing numbers activity is completed and stoped using open file...");
    }
}
