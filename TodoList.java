import java.util.ArrayList;

public class TodoList{

    ArrayList<TodoItem> todoList = new ArrayList<TodoItem> ();

    public void addItem (TodoItem item) {
        this.todoList.add(item);
    }

    public void archiveItem (TodoItem item) {
        for(int i =0; i < todoList.size(); i++) {
            if(item.getIsDone()) {
                todoList.remove(item);
            }
        }
    }
}
