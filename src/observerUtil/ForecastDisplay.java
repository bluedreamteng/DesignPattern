package observerUtil;

import ObserverPattern.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("last Pressure = "+lastPressure +"----currentPressure = "+currentPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            this.currentPressure = weatherData.getPressure();
            display();
        }
    }
}
