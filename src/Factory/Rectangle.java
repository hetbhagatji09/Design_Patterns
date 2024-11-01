package Factory;

public class Rectangle implements Shape{
    private int len;
    private int width;

    public Rectangle(int len, int width) {
        this.len = len;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Draw the Rectangle");
    }

    @Override
    public void fillColor() {

    }
}
