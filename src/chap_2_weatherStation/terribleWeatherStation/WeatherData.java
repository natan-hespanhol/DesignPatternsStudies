package chap_2_weatherStation.terribleWeatherStation;

public class WeatherData {

  CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
  StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
  ForecastDisplay forecastDisplay = new ForecastDisplay();

  //what if we need more displays?? so we'll need add more things here, right? how bigger this can be?

  public void measurementsChanged() {
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure = getPressure();

    currentConditionsDisplay.update(temp, humidity, pressure);
    statisticsDisplay.update(temp, humidity, pressure);
    forecastDisplay.update(temp, humidity, pressure);
    //..with more displays, more lines here too
  }

  public float getTemperature() {
    return (float) Math.random()*12;
  }

  public float getHumidity() {
    return (float) Math.random()*2.05f;
  }

  public float getPressure() {
    return (float) Math.random()*0.9893f;
  }
}
