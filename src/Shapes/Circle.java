package Shapes;

public class Circle  extends Shape implements Rollable{
    private float degree;
    private Point p;

    public Circle(float degree,float xPos,float ypos) {

        this.degree = degree;
        p=new Point(10,20);
        System.out.println("Circle is called with point");
    }

    @Override
    public String toString() {
        return "Circle{" +
                "degree=" + degree +
                ", p=" + p +
                '}';
    }

    @Override
    public void roll() {
        System.out.println("circle is rollable");
    }

    @Override
    public double area() {


        return 3.14*degree*degree;
    }
}
