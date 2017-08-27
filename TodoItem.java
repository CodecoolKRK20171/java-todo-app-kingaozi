public class TodoItem{
    private String name;
    boolean isDone;

    public TodoItem(String name){
        this.name = name;
        this.isDone = false;
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark () {
        this.isDone = false;
    }

    public String getName (String name) {
        return this.name;
    }

    public String getString () {

        if (this.isDone) {
            return  "[X] " + this.name;
        } 
        else {
            return "[ ] " + this.name;
        }
        
    }
    
}
