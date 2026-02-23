package extendsthread;

public class Main {
    public static void main(String[] args) {
        Model myThread = new Model();
        Prototype hiThread = new Prototype();
        myThread.start();
        // hiThread.setPriority(Thread.MAX_PRIORITY);
        try {
            myThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        hiThread.start();
    }
}
