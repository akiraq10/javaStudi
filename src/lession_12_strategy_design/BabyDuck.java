package lession_12_strategy_design;

public class BabyDuck extends Duck{
    public BabyDuck() {
        quackBehavior=new Squeak();
    }
}
