package Decorator;

public class ButterSpread extends BreadDecorator{
    public ButterSpread(BreadItem breadItem) {
        super(breadItem);
    }

    @Override
    public int cost() {
        System.out.println("additional cost is 10 ruppes for butter");
        return breadItem.cost()+10;
    }
}
