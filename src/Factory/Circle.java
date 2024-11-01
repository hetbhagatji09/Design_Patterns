package Factory;

public class Circle implements  Shape{
    private int xPos;
    private int yPos;
    private int radius;

    public Circle(int xPos, int yPos, int radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw the circle");
    }

    @Override
    public void fillColor() {

    }
}
