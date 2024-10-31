package Shapes;

public class Circle  extends Shape implements Rollable{
    private float degree;

    public Circle(float degree) {
        this.degree = degree;
    }

    @Override
    public void roll(float degree) {
        System.out.println("circle is rollable");
    }

    @Override
    public double area() {


        return 3.14*degree*degree;
    }
}
