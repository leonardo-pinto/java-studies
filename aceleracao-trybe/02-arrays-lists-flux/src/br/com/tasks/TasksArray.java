package br.com.tasks;

public class TasksArray {
    Task[] tasks;
    int counter = 0;

    public TasksArray(int size) {
        tasks = new Task[size];
    }

    public void addTask(Task task) {
        tasks[counter] = task;
        counter ++;
    }

    public void remoteTask(int position) {
        tasks[position] = null;
    }

    public void showTasks() {
        for(Task task: tasks) {
            task.showTask();
        }
    }


}
