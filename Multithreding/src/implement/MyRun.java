package implement;

public class MyRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Hi " + Thread.currentThread().getName());
    }
}