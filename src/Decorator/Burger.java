package Decorator;

public class Burger implements BreadItem{
    @Override
    public int cost() {
        return 40;
    }
}
