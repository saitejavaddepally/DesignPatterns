package ObserverPattern.WeatherExample;


import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    // store all the subscribers
    List<IObserver> iObserverList = new ArrayList<IObserver>();
    public int temperature;

    public void add(IObserver iObserver) {
        iObserverList.add(iObserver);
    }

    public void remove(IObserver iObserver) {
        int index = iObserverList.indexOf(iObserver);
        if(iObserverList.isEmpty()) return;
        iObserverList.remove(index);

        System.out.println("Removed " + iObserver.getClass().getName());
    }

    public void notifyObservers() {

        for(IObserver iObserver : iObserverList){
            iObserver.update();
        }
    }

    public int getTemperature(){
        return this.temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
}
