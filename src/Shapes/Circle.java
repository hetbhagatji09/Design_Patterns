package Shapes;

public class Circle  extends Shape implements Rollable{
    private float degree;

    public Circle(float degree) {
        this.degree = degree;
        System.out.println("Circle is called");
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
