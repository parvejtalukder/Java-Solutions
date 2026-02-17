package extendsthread;

public class Model extends Thread {
    int net_tickets = 1;

    @Override
    public void run() {
        // System.out.println("It's " + Thread.currentThread().getName());
        // Thread.currentThread().setName();
            //         for(int i = 1; i <= 300; i++) {
            // System.out.println(i);
            // if (i % 10 == 0) {
            //     try {
            //         System.out.println("Going to sleep for a bit..");
            //         sleep(1000);  
            //         try {
            //             System.out.println("........I am back!" + " " + Thread.currentThread().getName());
            //             sleep(300);
            //         } catch (Exception e) {
            //             e.printStackTrace();
            //         }
            //     } catch (Exception e) {
            //         e.printStackTrace();
            //     }
            // }
            //}
            // // System.out.print("I am back!");
            // CallMe(String str);
    }
    public synchronized void CallMe(String nm) {
        if (net_tickets > 0) {
            System.out.println(nm + " Done!");
            net_tickets--;
        }
        else System.out.println("Sorry, No Ticket! " + nm);
    }
}
