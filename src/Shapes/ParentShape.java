package Shapes;

public class ParentShape {
    public static void main(String args[]){
        System.out.println("This is Circle");

        Circle c=new Circle(10,20,30);
        c.roll();
        System.out.println(c.area());
        Rectangle r=new Rectangle(10,20);
        r.rotatable();
        System.out.println(r.area());

    }
}
