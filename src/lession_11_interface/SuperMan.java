package lession_11_interface;

public class SuperMan extends Human implements MoveAble, SwimAble {

    @Override
    public void move() {
        System.out.println("duy chuyen theo cach cua siu nhan");
    }

    @Override
    public void swim() {
        System.out.println("boid theo cach cua siu nhan");
    }
}
