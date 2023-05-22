package chap_1_duckSimulator.solutionWithStrategy.behaviors;

public class EletronicQuack implements QuackBehavior {
  @Override public void quack() {
    System.out.println("Quacking from a strange electronic device <<beep>>");
  }
}
