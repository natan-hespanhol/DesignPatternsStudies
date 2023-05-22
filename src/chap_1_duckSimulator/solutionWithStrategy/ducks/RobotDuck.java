package chap_1_duckSimulator.solutionWithStrategy.ducks;

import chap_1_duckSimulator.solutionWithStrategy.behaviors.EletronicQuack;
import chap_1_duckSimulator.solutionWithStrategy.behaviors.FlyWithARocket;

public class RobotDuck extends Duck {

  public RobotDuck() {
    quackBehavior = new EletronicQuack();
    flyBehavior = new FlyWithARocket();
  }

  @Override public void display() {
    System.out.println("I'm a robot duck, beep! beep!");
  }
}
