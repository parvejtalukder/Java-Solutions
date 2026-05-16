package thread;
import java.util.List;
import file.TaskSaver;
import model.Task;

public class AutoSaveThread extends Thread {
    private List<Task> tasks;
    private TaskSaver saver;
    public AutoSaveThread(List<Task> tasks, TaskSaver saver) {
        this.tasks = tasks;
        this.saver = saver;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10000);
                saver.save(tasks);
                System.out.println("Auto-saved...");
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}