package Prototype;

public class Main {
    public static void main(String args[]) throws CloneNotSupportedException {
        ShapeCache.loadCache();
         Shape circle=ShapeCache.getShape("1");
         circle.draw();
         Shape rectangle=ShapeCache.getShape("2");
         rectangle.draw();

    }
}
