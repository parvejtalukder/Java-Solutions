package exmpractice;

public class PlayRunnable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + "IS RUNNING..");
    }

    public static void main(String[] args) {
        Thread pht = new Thread(new PlayRunnable());
        pht.start();
        PlayThread ph = new PlayThread();
        ph.start();
    }

}