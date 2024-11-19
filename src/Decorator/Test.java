package Decorator;

public class Test {
    public static void main(String args[]){
        System.out.println("order processing");
        System.out.println(new Sandwich().cost());
        System.out.println(new ButterSpread(new Sandwich()).cost());

    }
}
