package chap_2_weatherStation.terribleWeatherStation;

public class CurrentConditionsDisplay {
  public void update(float temperature, float humidity, float pressure) {
    System.out.println("Current condition: " + temperature +" degrees (temp), "+ humidity + "% (humidity) ");
  }

}