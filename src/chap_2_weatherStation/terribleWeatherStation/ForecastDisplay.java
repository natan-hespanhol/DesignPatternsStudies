package chap_2_weatherStation.terribleWeatherStation;

public class ForecastDisplay {
  public void update(float temperature, float humidity, float pressure) {
    System.out.println("Forecast Display>> " + humidity);

    if(temperature < 10 && humidity > 1.0f){
      System.out.println("probably it'll rain Today.");
    }
    else if(temperature > 30){
      System.out.println("it's very hot Today.");
    }
    else{
      System.out.println("\t\t it's a nice day Today.");
    }
  }
}
