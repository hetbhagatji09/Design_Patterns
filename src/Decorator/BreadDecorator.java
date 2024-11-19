package Decorator;

public class BreadDecorator implements BreadItem{
    protected BreadItem breadItem;

    public BreadDecorator(BreadItem breadItem) {
        this.breadItem = breadItem;
    }

    @Override
    public int cost() {
        return breadItem.cost();
    }
}
