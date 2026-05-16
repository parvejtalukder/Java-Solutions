package model;

public class Task {
    public int id;
    public String title;
    public boolean done;

    public Task(int id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public int getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean getDone() {
        return this.done;
    }

    @Override
    public String toString() {
        return id + " | " + title + " | " + (done ? "DONE" : "ACTIVE");
    }
}