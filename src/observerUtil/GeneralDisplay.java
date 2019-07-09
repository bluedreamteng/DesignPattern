package observerUtil;

import ObserverPattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperture;
    private float humidity;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperture = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperture+" f degrees and "+humidity +"% humidity");
    }
}
