package Prototype;

public class Circle extends Shape{
    public Circle(){
        type="Circle";
        System.out.println("circle is created");
    }

    @Override
    void draw() {
        System.out.println("Circle in draw method");
    }
}
