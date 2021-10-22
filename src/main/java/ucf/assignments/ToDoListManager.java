package ucf.assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToDoListManager
{
    public ArrayList<ToDoList> toDoLists;//arrayList used to support at least 100 to do lists

    public ToDoListManager(){
        /*
            this.toDoLists = new ArrayList<>()
         */
    }
    public void addToDoList(ToDoList t){
        /*
            toDoLists.add(t)
         */
    }
    public ToDoList removeToDoList(int index){
        /*
            return toDoLists.remove(index);
         */
        return new ToDoList();
    }
    public void editToDoListTitle(int index, String title) {
        /*
            toDoLists.get(index).setTitle(title)
         */
    }

    public void AddItemToToDoList(int index, ToDoItem item){
        /*
            toDoLists.get(index).addItem(item)
         */
    }
    public void RemoveItemFromToDoList(int toDoIndex, int itemIndex){
        /*
            toDoLists.get(toDoIndex).remove(itemIndex)
         */
    }
    public void saveSingleToDoList(int index, String path){
    /*
        toDoLists.get(index).saveToDoList(path)
     */
    }
    public void saveAllToDoLists(){
        /*
        String s = ""
        for ToDoList t in toDoLists
            s+=t.saveToDoList()
        end loop
        fw = new FileWriter()
        fw.write(s)
         */
    }
    public void loadSingleToDoList( String path){//made it void because it is going right into the arrayList
        /*
        toDoLists.add(loadToDoList(path))
         */
    }
    public void loadAllToDoLists(int index, String path){
        /*
        ArrayList<ToDoList> t = toDoLists.get(index).loadToDoList(path)
        for ToDoList x in t
            toDoLists.add(x)
        end loop
         */
    }
}