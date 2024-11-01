package Builder;

public class ToDoBuilder {
    private int id;
    private String title;
    private String descreption;
    private String status;
    private boolean completed;

    public ToDoBuilder withTitle(String title){
        this.title=title;
        return this;
    }
    public ToDoBuilder withDescreption(String descreption){
        this.descreption=descreption;
        return this;
    }
    public ToDoBuilder withStatus(String status){
        this.status=status;
        return this;
    }
    public ToDoBuilder withId(int id){
        this.id=id;
        return this;
    }
    public ToDoBuilder withcompleted(boolean completed){
        this.completed=completed;
        return this;
    }
    public ToDo build(){
        return new ToDo(id,title,descreption,status,completed);
    }
}
