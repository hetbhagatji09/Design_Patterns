package Decorator;

public class Sandwich implements BreadItem{
    @Override
    public int cost() {
        System.out.println("Sandwich cost is 60");
        return 60;
    }
}
