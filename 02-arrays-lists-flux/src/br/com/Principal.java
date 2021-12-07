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

//        Task task1 = new Task("Study");
//        Task task2 = new Task("Exercise");
//        Task task3 = new Task("Sleep");
//        Task task4 = new Task("This task is too big and should not be printed!!!");
//       addTask was implemented in TasksList!

        tasks.addTask("Study");
        tasks.addTask("Eat");


//        tasks.addTask(task1);
//        tasks.addTask(task2);
//        tasks.addTask(task3);
//        tasks.addTask(task4);
        tasks.showTasks();

        Task getByDescription = tasks.getTask("Study");
        getByDescription.showTask();
    }
}

