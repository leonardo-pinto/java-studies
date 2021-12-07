package br.com;

import br.com.tasks.Task;
import br.com.tasks.TasksArray;
import br.com.tasks.TasksList;

public class Principal {

    public static void main(String[] args) {
        System.out.println("My tasks");
        System.out.println("-----------");

//        TasksArray tasks = new TasksArray(3); utilizando arrays
        TasksList tasks = new TasksList(); // utilizando lista de arrays

        Task task1 = new Task("Study");
        Task task2 = new Task("Exercise");
        Task task3 = new Task("Sleep");

        tasks.addTask(task1);
        tasks.addTask(task2);
        tasks.addTask(task3);
        tasks.showTasks();
    }
}

