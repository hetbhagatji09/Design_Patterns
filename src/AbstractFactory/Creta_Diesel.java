package AbstractFactory;

public class Creta_Diesel implements DieselCar{
    @Override
    public void start() {
        System.out.println("Starting engine of creta diesel");
    }
}
