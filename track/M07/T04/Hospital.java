
class Hospital implements Runnable {

    String res1 = "Bed";
    String res2 = "Doctor";

    @Override
    public void run() {
        String tn = Thread.currentThread().getName();
        if (tn.equals("TOM")) {
            tomTreatment();
        } else {
            jerryTreatment();
        }
    }

    void tomTreatment() {
        try {
            synchronized (res1) {
                System.out.println("Tom is occupied " + res1);
                Thread.sleep(3000);

                synchronized (res1) {
                    System.out.println("Tom is occupied " + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Tom released " + res2);
            }
            System.out.println("Tom released " + res1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void jerryTreatment() {
        try {
            synchronized (res1) {
                System.out.println("Jerry is occupied " + res1);
                Thread.sleep(3000);
                synchronized (res2) {
                    System.out.println("Jerry is occupied " + res2);
                    Thread.sleep(3000);
                }
                System.out.println("Jerry released " + res2);

            }
            System.out.println("Jerry released " + res1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
