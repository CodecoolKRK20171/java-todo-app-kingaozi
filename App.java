import java.util.Scanner;

public class App{

    static TodoList listOfTodoItems = new TodoList();
  
  public static void main(String[] args) {

      boolean isWorking = true;

      while (isWorking) {

          showMenu();
          Scanner reader = new Scanner(System.in);
          String userInput = reader.nextLine();

          if (userInput.equals("1")) {
              listOfTodoItems.getItemsList();
          }

          else if (userInput.equals("2")) {
              System.out.println("Enter the task name you want to add to the list: ");
              String task =reader.nextLine();
              listOfTodoItems.addItem(task);
          }
          else if (userInput.equals("3")) {
            System.out.println("Enter the task name you want to mark: ");
            Scanner scanner = new Scanner(System.in);
            String itemToMark = scanner.nextLine();
            listOfTodoItems.markItem(itemToMark);
          }
          else if (userInput.equals("4")) {
              listOfTodoItems.archiveItem();
          }
          else if (userInput.equals("0")) {
              isWorking = false;
          }

      }
  }

  public static void showMenu () {
      String menuOptions = String.format("%s\n%s\n%s\n%s\n%s\n%s\n",
          "\nChose an option:\n",
          "(1) show To Do List",
          "(2) add task to To Do List",
          "(3) mark task",
          "(4) archive tasks",
          "(0) Exit");

      System.out.print(menuOptions);
  }
}

