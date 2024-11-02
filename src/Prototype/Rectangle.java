package Prototype;

public class Rectangle extends Shape{
    public Rectangle(){
        type="Rectangle";
        System.out.println("Rectangle is created");
    }

    @Override
    void draw() {
        System.out.println("Rectangle in draw method");
    }
}
