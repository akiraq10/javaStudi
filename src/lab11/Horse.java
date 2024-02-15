package lab11;

public class Horse implements MoveAble,FlyAble{
    private int speed;

    public Horse(int speed) {
        this.speed = speed;
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
