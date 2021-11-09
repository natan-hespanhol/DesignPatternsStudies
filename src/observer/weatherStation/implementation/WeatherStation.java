package observer.weatherStation.implementation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionalDisplay display1 = new CurrentConditionalDisplay(weatherData);
        StaticDisplay display2 = new StaticDisplay(weatherData);
        ForecastDisplay display3 = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(10.55f, 53, 2);
        weatherData.setMeasurements(11.55f, 50, 1.6f);
        weatherData.setMeasurements(12.55f, 70, 1.8f);
    }
}