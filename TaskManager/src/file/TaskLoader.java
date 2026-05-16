package file;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import model.Task;

public class TaskLoader {
    private String fileName;
    public TaskLoader(String fileName) {
        this.fileName = fileName;
    }
    public List<Task> load() {
        List<Task> tasks = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists()) return tasks;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split("\\|");
                tasks.add(new Task(
                        Integer.parseInt(p[0]),
                        p[1],
                        Boolean.parseBoolean(p[2])
                ));
            }
        } catch (Exception e) {
            System.out.println("Load error: " + e.getMessage());
        }
        return tasks;
    }
}