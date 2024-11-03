package Adapter;

public class WeatherSvcImpl implements WeatherSvc{
    @Override
    public float getTempreature() {
        return 40.0f;
    }

    @Override
    public float getHumidity() {
        return 65.8f;
    }
}
