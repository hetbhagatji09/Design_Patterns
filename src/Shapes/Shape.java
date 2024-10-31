package Shapes;

public  abstract class Shape {
    private Shape parentShape;

    public Shape getParentShape() {
        return parentShape;
    }

    public void setParentShape(Shape parentShape) {
        this.parentShape = parentShape;
    }

    abstract public double area();
}
