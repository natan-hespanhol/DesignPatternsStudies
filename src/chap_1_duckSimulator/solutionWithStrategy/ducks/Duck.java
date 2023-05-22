package chap_1_duckSimulator.solutionWithStrategy.ducks;

import chap_1_duckSimulator.solutionWithStrategy.behaviors.FlyBehavior;
import chap_1_duckSimulator.solutionWithStrategy.behaviors.QuackBehavior;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public void performQuack() { // this replaces our old "quack()" method
    quackBehavior.quack();
  }

  public void performFly() {//this replaces our old "fly()" method
    flyBehavior.fly();
  }

  public void swim(){
    System.out.println("swimming");
  }

  public abstract void display();

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }
}
