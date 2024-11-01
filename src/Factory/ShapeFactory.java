package Factory;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        switch (shapeType){
            case "Circle":
                return new Circle(10,20,30);
            case "Rectangle":
                return new Rectangle(10,20);
            default:
                System.out.println("No shape is found");
        }
        return null;
    }
}
