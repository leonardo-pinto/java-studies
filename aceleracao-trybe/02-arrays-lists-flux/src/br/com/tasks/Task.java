package br.com.tasks;

public class Task {

    String description;

    public Task(String description) {
        this.description = description;
    }

    public void showTask() {
        System.out.println(description);
    }

    public int getTaskLength() {
        return description.length();
    }
}
