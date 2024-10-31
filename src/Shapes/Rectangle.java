package Shapes;

public class Rectangle extends Shape implements Rotatable{
    private int length,width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void rotatable(float degree) {
        System.out.println("Rectangle is Rotatable");
    }

    @Override
    public double area() {
        return length*width;
    }
}
