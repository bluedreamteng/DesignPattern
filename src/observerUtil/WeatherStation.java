package observerUtil;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(20.2f,20.3f,20.4f);
        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(1,2,3);

    }
}
