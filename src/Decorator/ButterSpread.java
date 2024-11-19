package Decorator;

public class ButterSpread extends BreadDecorator{
    public ButterSpread(BreadItem breadItem) {
        super(breadItem);
    }

    @Override
    public int cost() {
        return breadItem.cost()+10;
    }
}
