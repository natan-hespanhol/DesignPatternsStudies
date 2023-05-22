package chap_2_weatherStation.observerSolution.implementation;

import chap_2_weatherStation.observerSolution.interfaces.DisplayElement;import chap_2_weatherStation.observerSolution.interfaces.Observer;

public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("[ForecastDisplay Display] " + temperature +" degrees (temp), "+ humidity + "% (humidity) ");
    }
}