package chap_1_duckSimulator.solutionWithStrategy.behaviors;

public class Squeak implements QuackBehavior {
  @Override public void quack() {
    System.out.println("Squeak!");
  }
}
