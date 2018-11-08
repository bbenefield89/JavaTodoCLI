package main.java.todo;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

class ReadTodo {
  JSONArray todoList;

  /**
   * @return Object todoList
   */
  public JSONArray getTodoList() throws Exception {
    this.setTodoList();
    return this.todoList;
  }
  
  /**
   * @return void
   */
  private void setTodoList() throws Exception {
    // System.out.println(new File(".").getAbsolutePath());
    FileReader todoList = new FileReader("./src/main/resources/todo.json");
    Object todoListObj = new JSONParser().parse(todoList);
    this.todoList = (JSONArray) todoListObj;
  }
}