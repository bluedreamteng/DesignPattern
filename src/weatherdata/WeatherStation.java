package weatherdata;

/**
 * @description: 气象站测试程序
 * @author: zhangtf
 * @create: 2019-07-11 21:44
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurments(80, 65, 30.4f);
        weatherData.setMeasurments(82, 70, 29.2f);
        weatherData.setMeasurments(78, 90, 29.2f);
    }
}
