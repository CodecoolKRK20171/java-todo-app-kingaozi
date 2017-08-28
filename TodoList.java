import java.util.ArrayList;

public class TodoList{

    ArrayList<TodoItem> todoList = new ArrayList<TodoItem> ();

    public void addItem (TodoItem item) {
        this.todoList.add(item);
    }

    public void archiveItem () {
        for(int i =0; i < todoList.size(); i++) {
            if(todoList.get(i).getIsDone()) {
                todoList.remove(i);
            }
        }
    }

    public void markItem(String chosenItem) {
        for (TodoItem item: todoList) {
            if(item.getItemName().equals(chosenItem)) {
                item.mark();
            }
            else {
                System.out.println("There is no such option!");
            }
        }
    }
}
