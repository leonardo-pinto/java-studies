package br.com.tasks;

import java.util.ArrayList;

public class TasksList {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(int position) {
        this.tasks.remove(position);
    }

    public void showTasks() {
        for (Task task: tasks) {
            task.showTask();
        }
    }
}
