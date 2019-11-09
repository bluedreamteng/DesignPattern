package weatherdata2;

import java.util.Observable;

/**
 * @description: 天气数据
 * @author: zhangtf
 * @create: 2019-07-11 22:08
 */
public class WeatherData extends Observable {
    private float temperture;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public float getTemperture() {
        return temperture;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    public void setMeasurements(float temperture, float humidity, float pressure0) {
        this.temperture = temperture;
        this.humidity = humidity;
        this.pressure = pressure0;
        measurementsChanged();
    }
}
