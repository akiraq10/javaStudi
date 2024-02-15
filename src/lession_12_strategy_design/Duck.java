package lession_12_strategy_design;

public class Duck {


    protected  QuackBehavior quackBehavior;
    protected void performQuack(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
