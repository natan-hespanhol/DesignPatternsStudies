package chap_1_duckSimulator.solutionWithStrategy.ducks;

import chap_1_duckSimulator.solutionWithStrategy.behaviors.FlyWithWings;
import chap_1_duckSimulator.solutionWithStrategy.behaviors.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck now!");
  }
}
