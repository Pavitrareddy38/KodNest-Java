class PrintNum1 implements Runnable{
    @Override  
    public void run(){
         System.out.println("Printing the Numbers is started....");
         for(int i = 1;i <= 5;i++){
            System.out.println("Number: " + i);
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
         }
    }
}