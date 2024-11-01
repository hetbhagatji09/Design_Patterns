package Builder;

import java.util.ArrayList;
import java.util.List;

public class ToDoDirector {
    List<ToDo>todos=new ArrayList<>();
    public void addWithId(){
        todos.add(
                new ToDoBuilder().withId(1).build()
        );
    }
    public void addAll(){
        todos.add(
                new ToDoBuilder().withId(2)
                        .withTitle("Attendence")
                        .withStatus("pending")
                        .withcompleted(true)
                        .withDescreption("I am Going to Collage")
                        .build()
        );
    }
    public void printTodos(){
        for(ToDo t:todos){
            System.out.println(t);
        }

    }
}
