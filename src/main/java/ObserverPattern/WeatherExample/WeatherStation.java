package ObserverPattern.WeatherExample;


import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    // store all the subscribers
    List<IObserver> iObserverList = new ArrayList<IObserver>();

    public void add(IObserver iObserver) {
        iObserverList.add(iObserver);
    }

    public void remove(IObserver iObserver) {
        int index = iObserverList.indexOf(iObserver);
        iObserverList.remove(index);

        System.out.println("Removed " + iObserver);
    }

    public void notifyObservers() {

        for(IObserver iObserver : iObserverList){
            iObserver.update();
        }
    }

    public double getTemperature(){
        return Math.random() * 100;
    }
}
