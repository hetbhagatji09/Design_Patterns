package Decorator;

public class CheeseSpread extends BreadDecorator{
    public CheeseSpread(BreadItem breadItem) {
        super(breadItem);
    }

    @Override
    public int cost() {
        System.out.println("additional cost is 20 ruppes for cheese");
        return breadItem.cost()+20;
    }
}
