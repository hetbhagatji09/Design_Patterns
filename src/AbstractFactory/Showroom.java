package AbstractFactory;

import Factory.Shape;

import java.util.ArrayList;

public class Showroom {
    private final ArrayList<Car>cars=new ArrayList<>();
    public void addCar(String carType,String objectType){
        Car car=null;
        switch (objectType){
            case "Diesel":
                car=new DiesalCarFactory().getCar(carType);
            case "Petrol":
                car=new PetrolCarFactory().getCar(carType);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + objectType);
        }
        cars.add(car);

    }
    public void getCars(){
        for(Car c:cars){
            c.start();
        }
    }
}
