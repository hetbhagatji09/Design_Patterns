package Adapter;

public class NewsChannel {
    public static void main(String args[]){
        WeatherSvcImpl w=new WeatherSvcImpl();
        WeatherService weatherService=new WeatherServiceAdapter(w);
        System.out.println(weatherService.humidity());

    }
}
