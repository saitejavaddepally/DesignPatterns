package ObserverPattern.WeatherExample;

public class Phone implements IObserver, Display{

    WeatherStation weatherStation;
    double temperature;

    public Phone(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    public void update() {
        this.temperature = weatherStation.getTemperature();
        display();
    }

    public void display() {
        System.out.println("Current temperature : " + temperature);
    }
}
