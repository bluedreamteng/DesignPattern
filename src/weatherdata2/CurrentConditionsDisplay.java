package weatherdata2;

import weatherdata.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 当前天气状况展示板
 * @author: zhangtf
 * @create: 2019-07-11 22:20
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperture;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperture = weatherData.getTemperture();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperture + "F degrees and " + humidity + "% humidity");
    }
}
