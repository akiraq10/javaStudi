package lession_11_interface;


public class Dog extends Animal implements MoveAble,SwimAble {

    @Override
    public void move() {
        System.out.println("chay bang cach cua cho");

    }

    @Override
    public void swim() {
        System.out.println("boi bang cach cua cho");
    }
}
