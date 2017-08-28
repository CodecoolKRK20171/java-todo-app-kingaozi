public class TodoItem{
    
    private String itemName;
    boolean isDone;

    public TodoItem(String itemName){
        this.itemName = itemName;
        this.isDone = false;
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark () {
        this.isDone = false;
    }

    public String getItemName () {
        return this.itemName;
    }

    public String showString () {

        String info;

        if (this.isDone) {
            info =  "[X] " + this.itemName;
        } 
        else {
            info = "[ ] " + this.itemName;
        }
        return info;
        
    }

    public boolean getIsDone () {
        return this.isDone;
    }
    
}
