package file;
import java.io.*;
import java.util.List;
import model.Task;

public class TaskSaver {
    private String fileName;
    public TaskSaver(String fileName) {
        this.fileName = fileName;
    }
    public void save(List<Task> tasks) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Task t : tasks) {
                bw.write(t.id + "|" + t.title + "|" + t.done);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Save error: " + e.getMessage());
        }
    }
}