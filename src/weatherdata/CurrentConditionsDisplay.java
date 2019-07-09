package weatherdata;

/**
 * @description: CurrentConditonsDisplay displays current weatherData
 * @author: zhangtf
 * @create: 2019-07-09 07:08
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperture;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperture, float humidity, float pressure) {
        this.temperture = temperture;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperture
            + "F degrees and " + humidity + "% humidity");
    }

}
