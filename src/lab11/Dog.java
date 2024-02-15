package lab11;

import java.security.SecureRandom;

public class Dog implements MoveAble,FlyAble{
    private int speed;

    public Dog(int speed) {
        this.speed= speed;
    }

    @Override
    public int speed() {
        return speed;
    }

    @Override
    public boolean fly() {
        return false;
    }
}
