package chap_1_duckSimulator.chaos;

public class RubberDuck extends Duck{

  @Override
  public void quack() {
    System.out.println("squeak!");
  }

  @Override
  public void fly() {
    //do nothing
  }

  @Override
  public void display() {
    System.out.println("I'm a rubber duck, quack!");
  }

  public static void main(String[] args){ //a little demonstration
    RubberDuck rubberDuck = new RubberDuck();

    rubberDuck.display();
    rubberDuck.quack();
    rubberDuck.swim();
    rubberDuck.fly(); //wait, how does a rubber duck fly? we have a useless method here
  }
}
