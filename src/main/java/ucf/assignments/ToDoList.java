package ucf.assignments;

import java.util.ArrayList;
import java.util.Date;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Bryson Paul
 */
public class ToDoList {
    public String title;
    public ArrayList<ToDoItem> toDoList;//can do 100 or more, so is a good thing to use
    public ToDoList(){
        /*
        this.title = " "
        this.toDoList = new ArrayList<>()
         */
    }

    public void addItem(ToDoItem t){
        /*
            toDoList.add(t)
         */
    }
    public void removeItem(int index){
        /*
            toDoList.remove(index)
         */
    }
    public void setTitle(String s){
        /*
        this.title=s
         */
    }
    public void editToDoItemDesc(int index,String s){
        /*
        toDoList.get(index).setDescription(s)
         */

    }
    public void editToDoItemDueDate(int index, Date d){
        /*
        toDoList.get(index).setDate(d)
         */
    }
    public void markItemAsComplete(int index){
        /*
        toDoList.get(index).markAsComplete();
         */
    }
    public void displayExistingItems(int index){
     /*
        for ToDoItem i in this.toDoList
            i.display()
        end loop
      */
    }
    public void displayCompletedItems(int index){
     /*
        for ToDoItem i in this.toDoList
            if i.isComplete()
                i.display()
            end if
        end loop
      */
    }
    public void displayIncompleteItems(int index){
     /*
        for ToDoItem i in this.toDoList
            if !i.isComplete()
                i.display()
            end if
        end loop
      */
    }
    public void saveToDoList(String path){
        /*
         Gson gson = new Gson()
         gson.toJson(this, new FileWriter(path))
         */
    }
    //this one will be called when saving every single to do list
    public String saveToDoList(){
        return "";
     /*
      Gson gson = new Gson()
      return gson.toJson(this)
      */
    }
    //for single to do list
    public ToDoList loadToDoList(String path){
        /*
        Gson gson = new Gson()
        return gson.fromJson(path)
         */
        return new ToDoList();
    }
}