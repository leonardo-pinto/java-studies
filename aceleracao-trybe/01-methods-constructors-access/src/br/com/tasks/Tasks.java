package br.com.tasks;

public class Tasks {

    String description; // local attribute;

    public Tasks(String description) {
        this.description = description; // constructor
    }

    public void showTask() {
        System.out.println(description);
    }

    public int taskLength() {
        return description.length();
    }
}
