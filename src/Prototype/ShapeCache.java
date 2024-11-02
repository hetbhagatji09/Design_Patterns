package Prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String,Shape>shapeMap=new HashMap<>();
    public static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cachedShape=shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();

    }
    public static void loadCache(){
        System.out.println("starting objects creation and catching");
        Circle c=new Circle();
        c.setId("1");
        shapeMap.put(c.getId(),c);
        Rectangle r=new Rectangle();
        r.setId("2");
        shapeMap.put(r.getId(),r);
        System.out.println("Objects are cached");

    }


}
