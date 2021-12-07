package br.com.tasks;

import java.util.ArrayList;

public class TasksList {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        if (task != null && task.getTaskLength() <= 20) {
            this.tasks.add(task);
        } else {
            System.out.println("Invalid task!");
        }
    }

    public void addTask(String description) {
        Task task = new Task(description);
        addTask(task);
    }

    public Task getTask(String description) {
        for (Task task: tasks) {
            if (description.equals(task.description)) {
                return task;
            }
        }
        System.out.println("Task not found!");
        return null;
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
