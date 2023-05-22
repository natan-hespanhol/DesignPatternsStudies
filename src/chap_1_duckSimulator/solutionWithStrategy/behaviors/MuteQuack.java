package chap_1_duckSimulator.solutionWithStrategy.behaviors;

public class MuteQuack implements QuackBehavior {

  @Override public void quack() {
    System.out.println("<< silence >>");
  }
}
