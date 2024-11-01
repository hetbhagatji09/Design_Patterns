package Builder;

public class ToDo {
    private int id;
    private String title;
    private String descreption;
    private String status;
    private boolean completed;

    public ToDo(int id, String title, String descreption, String status, boolean completed) {
        this.id = id;
        this.title = title;
        this.descreption = descreption;
        this.status = status;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
