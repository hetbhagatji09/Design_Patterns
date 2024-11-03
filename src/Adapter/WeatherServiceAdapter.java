package Adapter;

public class WeatherServiceAdapter implements WeatherService{

    WeatherSvc weatherSvc;
    public WeatherServiceAdapter(WeatherSvcImpl weatherSvc1){
        this.weatherSvc=weatherSvc1;
    }
    @Override
    public float tempreature() {
        return weatherSvc.getTempreature();
    }

    @Override
    public float humidity() {
        return weatherSvc.getHumidity();
    }
}
