package lession_12_strategy_design;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("queak queak");
    }
}
