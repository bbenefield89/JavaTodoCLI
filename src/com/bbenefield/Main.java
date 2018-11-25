package com.bbenefield;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cliArgumentParser = new Scanner(System.in);
        String cliArgument;
        TaskList taskList = new TaskList();

        do {
            System.out.printf(
                    "\nWelcome back, would you like to\n" +
                    "1: See your list of tasks\n" +
                    "2: Add a new task\n" +
                    "3: Remove a task\n" +
                    "Q: Quit\n"
            );

            cliArgument = cliArgumentParser.nextLine().toLowerCase();

            switch (cliArgument) {
                case "1":
                    taskList.getAllTasks();
                    break;

                case "2":
                    System.out.println("ADD NEW TASK");
                    break;

                case "3":
                    System.out.println("DELETE A TASK");
                    break;

                case "Q":
                    System.out.println("LIST ALL TASKS");
                    break;

                default:
                    System.out.printf("\"%s\" is not a supported command.", cliArgument);
            }
        }
        while (!cliArgument.equals("q"))
            ;
    }
}
