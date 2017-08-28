import java.util.ArrayList;

public class TodoList{

    ArrayList<TodoItem> todoList = new ArrayList<TodoItem> ();

    public void addItem (String item) {
        
        TodoItem task= new TodoItem(item);
        this.todoList.add(task);
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
        }
    }

    public void getItemsList () {

        int index = 1;

        for(TodoItem item: todoList) {
            System.out.println("(" + index + ")" + item.showString());
            index ++;
        }
    }
}
