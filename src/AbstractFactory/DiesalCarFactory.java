package AbstractFactory;

public class DiesalCarFactory implements CarFactory{
    @Override
    public Car getCar(String carType) {
        switch (carType){
            case "I20":
                return new I20_Diesel();
            case "Creta":
                return new Creta_Diesel();

        }
        return null;
    }
}
