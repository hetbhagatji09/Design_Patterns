package Shapes;

public class Rectangle extends Shape implements Rotatable{
    private int length,width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Rectangle is called");
    }

    @Override
    public void rotatable() {
        System.out.println("Rectangle is Rotatable");
    }

    @Override
    public double area() {
        return length*width;
    }
}
