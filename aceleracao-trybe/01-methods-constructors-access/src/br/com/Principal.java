package br.com;

import br.com.tasks.Tasks;

public class Principal {

    public static void main(String[] args) {
        System.out.println("My tasks:");
        System.out.println("------------");
        Tasks task1 = new Tasks("Study"); // new class instance
        task1.showTask();
        System.out.println("Task 1 has " + task1.taskLength() + " characters !");
    }
}

