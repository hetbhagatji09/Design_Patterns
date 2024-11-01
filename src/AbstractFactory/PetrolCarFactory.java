package AbstractFactory;

public class PetrolCarFactory implements CarFactory{
    @Override
    public Car getCar(String carType) {
        switch (carType){
            case "Creta":
                return new Creta_Petrol();
            case "I20":
                return new I20_Petrol();
        }
        return null;
    }
}
