package Decorator;

public class Burger implements BreadItem{
    @Override
    public int cost() {
        System.out.println("Burger's cost is 40");
        return 40;
    }
}
