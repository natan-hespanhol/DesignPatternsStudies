package chap_1_duckSimulator.solutionWithStrategy;

import chap_1_duckSimulator.solutionWithStrategy.behaviors.FlyNoWay;
import chap_1_duckSimulator.solutionWithStrategy.ducks.Duck;
import chap_1_duckSimulator.solutionWithStrategy.ducks.MallardDuck;
import chap_1_duckSimulator.solutionWithStrategy.ducks.RobotDuck;

public class DuckSimulator {
  public static void main(String[] args){
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
    mallard.display();

    System.out.println("_______________________________________________");

    Duck robotD = new RobotDuck();
    robotD.display();
    robotD.performQuack();
    robotD.performFly();

    System.out.println("Robot D reconfigured...\n \t\t loading... \n [FLY]");
    robotD.setFlyBehavior(new FlyNoWay());
    robotD.performFly();
  }
}
