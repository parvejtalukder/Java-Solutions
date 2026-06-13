package multithreads;

public class Popup implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " STARTED");

        try {

            for (int i = 1; i <= 100; i++) {
                System.out.println(Thread.currentThread().getName() + " COUNTING... " + i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {

            System.out.println(Thread.currentThread().getName() + " INTERRUPTED");
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println(Thread.currentThread().getName() + " ENDED");
    }

    public static void main(String[] args) {

        Popup pop = new Popup();

        Thread one = new Thread(pop, "Native");
        Thread two = new Thread(pop, "MainNave");

        one.setPriority(Thread.MAX_PRIORITY);
        two.setPriority(Thread.MIN_PRIORITY);

        one.start();
        two.start();

        try {
            one.join(); 
            two.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
            Thread.currentThread().interrupt();
        }

        System.out.println("THREADS FINISHED!");
    }
}