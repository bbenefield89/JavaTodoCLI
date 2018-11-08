package main.java.todo;

// java.io
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

// custom
import main.java.todo.ReadTodo;

public class Main {
  public static void main(String[] args) throws Exception {
    // a reference to a new file
    File todoTxt = new File("./src/main/resources/todo.txt");
    // creates a new file or overwrites an existing file with nothnig
    File tempTxt = new File("./src/main/resources/temp.txt");
    BufferedReader br = new BufferedReader(new FileReader(todoTxt));
    BufferedWriter bw = new BufferedWriter(new FileWriter(tempTxt));
    String line = br.readLine();

    try {
      if (args[0].toLowerCase().equals("add")) {
        while (line != null) {
          // write all existing tasks to temp.txt
          bw.write(line + "\n");
          line = br.readLine();
        }
  
        // add new task new temp.txt
        bw.write(args[1] + "\n");
      }
      else if (args[0].toLowerCase().equals("remove")) {
        while (line != null) {
          if (!line.toLowerCase().equals(args[1].toLowerCase())) {
            bw.write(line + "\n");
          }
  
          line = br.readLine();
        }
      }

      // replace todo.text with updated temp.text
      tempTxt.renameTo(todoTxt);
    }
    catch(Exception e) {
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    }

    br.close();
    bw.close();
  }
}