package Factory;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Shape>shapes=new ArrayList<>();
    public void addShape(String shapeType){
        Shape shape=ShapeFactory.getShape(shapeType);
        shapes.add(shape);
    }
    public void redraw(){
        for(Shape s:shapes){
            s.draw();
        }
    }
}
