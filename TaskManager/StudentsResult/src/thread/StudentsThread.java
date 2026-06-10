package thread;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class StudentsThread extends Thread {

    private String action;
    private String message;
    private static final String LOG_FILE = "app.log";

    public StudentsThread(String action, String message) {
        this.action = action;
        this.message = message;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String log = "[" + LocalDateTime.now() + "] "
                    + action + " -> " + message + "\n";
            writer.write(log);
        } catch (IOException e) {
            System.out.println("Log Error: " + e.getMessage());
        }
    }
}