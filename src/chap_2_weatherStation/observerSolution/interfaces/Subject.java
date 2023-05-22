package chap_2_weatherStation.observerSolution.interfaces;

public interface Subject {

  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();

}
