package extendsthread;

public class Prototype extends Thread {
    @Override
    public void run() {
        int cnt = 0;
        for(char i = 'a'; i <= 'z'; i++) {
            cnt++;
            System.out.println(i);
            try {
               if (cnt % 20 == 0) {
                    System.out.println("I am trying to be same with..");
                    sleep(2000); 
               }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i == 'z') {
                i = 'a';
            }
            if (cnt == 300) {
            break;
        }
        }
    }
}