package com.bbenefield;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TaskList {
    private File todoFile = new File("./src/com/bbenefield/resources/todos.txt");
    private File tempFile = new File("./src/com/bbenefield/resources/temp.txt");
    private FileReader fr;
    private BufferedReader br;

    public TaskList() throws Exception {
        this.fr = new FileReader(todoFile);
        this.br = new BufferedReader(fr);
    }

    public void getAllTasks() throws Exception {
        printAllTasksFromFile();
    }

    private void printAllTasksFromFile() throws Exception {
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
