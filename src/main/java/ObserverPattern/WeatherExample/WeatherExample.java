package ObserverPattern.WeatherExample;

public class WeatherExample {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        Phone phone1 = new Phone(weatherStation);
        Phone phone2 = new Phone(weatherStation);
        Phone phone3 = new Phone(weatherStation);
        Phone phone4 = new Phone(weatherStation);

        weatherStation.add(phone1);
        weatherStation.add(phone2);
        weatherStation.add(phone3);
        weatherStation.add(phone4);
        weatherStation.remove(phone3);

        weatherStation.notifyObservers();
    }
}
