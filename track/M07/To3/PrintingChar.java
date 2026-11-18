class PrintingChar extends Thread {
    @Override
    public void run(){
        System.out.println("Printing Characters is Started...");
        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
        }
        System.out.println("Printing Characters is Completed...");
    }
}