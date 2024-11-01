package Factory;

public class Main {
    public static void main(String args[]){
        Canvas c=new Canvas();
        c.addShape("Circle");
        c.addShape("Rectangle");
        c.redraw();
        Canvas c2=new Canvas();
        c2.addShape("Rectangle");
        c2.addShape("Rectangle");
        c2.redraw();
    }
}
