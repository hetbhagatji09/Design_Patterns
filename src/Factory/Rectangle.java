package Factory;

public class Rectangle implements Shape{
    private int len;
    private int width;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

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
