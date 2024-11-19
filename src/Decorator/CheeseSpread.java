package Decorator;

public class CheeseSpread extends BreadDecorator{
    public CheeseSpread(BreadItem breadItem) {
        super(breadItem);
    }

    @Override
    public int cost() {
        return breadItem.cost()+20;
    }
}
