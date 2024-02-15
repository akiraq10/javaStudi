package lession_12_strategy_design;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehavior = new Quack();
    }
}
