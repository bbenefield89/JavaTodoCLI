package com.bbenefield;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class TaskList {
    private File tempFile;
    private BufferedReader br;

    TaskList() throws Exception {
        File todoFile = new File("./src/com/bbenefield/resources/todos.txt");
        FileReader fr = new FileReader(todoFile);
        tempFile = new File("./src/com/bbenefield/resources/temp.txt");
        br = new BufferedReader(fr);
    }

    void getAllTasks() throws Exception {
        printAllTasksFromFile();
    }

    private void printAllTasksFromFile() throws Exception {
        String line;
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
