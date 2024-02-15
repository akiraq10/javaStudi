package lession_12_strategy_design;

public class DuckTest {
    public static void main(String[] args) {
        Duck babyDuc=new BabyDuck();
        Duck mallardDuc=new MallardDuck();

        DuckTest duckTest=new DuckTest();

        babyDuc.setQuackBehavior(new Quack());
        duckTest.performQuack(babyDuc);
        duckTest.performQuack(mallardDuc);

    }
    public void performQuack(Duck duck){
        duck.performQuack();
    }

}
