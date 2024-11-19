package Decorator;

public class Sandwich implements BreadItem{
    @Override
    public int cost() {
        return 60;
    }
}
