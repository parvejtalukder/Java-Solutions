package exmpractice;

public class PlayThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + "IS RUNNING...");
        setPriority(MAX_PRIORITY);
    }

    public static void main(String[] args) {
        PlayThread pht = new PlayThread();
        pht.start();
    }

}
