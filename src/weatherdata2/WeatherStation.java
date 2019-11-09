package weatherdata2;

/**
 * @description: 测试观察者
 * @author: zhangtf
 * @create: 2019-07-11 22:26
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(20,30,40.2f);

    }
}
