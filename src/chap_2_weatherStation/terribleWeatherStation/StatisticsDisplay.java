package chap_2_weatherStation.terribleWeatherStation;

public class StatisticsDisplay {
  public void update(float temperature, float humidity, float pressure) {
    System.out.println("[Static Display] " + temperature +" degrees (temp), "+ humidity + "% (humidity) ");
  }
}
