package chap_2_weatherStation.observerSolution.interfaces;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}