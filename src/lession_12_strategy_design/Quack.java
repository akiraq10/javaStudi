package lession_12_strategy_design;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("quack quack!!");

    }
}
