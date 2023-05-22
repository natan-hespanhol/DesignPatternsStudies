package chap_1_duckSimulator.chaos;

public class DecoyDuck extends Duck {


    @Override
    public void display() { //if this will be a replacement for display in the Duck parent, why do we need to this implemented on Duck?
      System.out.println("I'm a decoy duck, quack!");
    }

  @Override
  public void quack() { //one more useless method
    //do nothing
  }

  @Override
  public void fly() { //one more useless method
    //do nothing
  }
}
