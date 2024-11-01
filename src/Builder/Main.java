package Builder;

public class Main {
    public static void main(String args[]){
        ToDoDirector director=new ToDoDirector();
        director.addWithId();
        director.addAll();
        director.printTodos();
    }
}
