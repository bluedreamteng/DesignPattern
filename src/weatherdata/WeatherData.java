package weatherdata;

import java.util.ArrayList;

/**
 * @description: this is a subject to manage weather data
 * @author: zhangtf
 * @create: 2019-07-09 06:52
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i ++){
            Observer observer = observers.get(i);
            observer.update(temperture,humidity,pressure);
        }
    }

    public void measurmentsChanged(){
        notifyObservers();
    }

    public void setMeasurments(float temperture, float humidity, float pressure) {
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure;
        measurmentsChanged();
    }
}
