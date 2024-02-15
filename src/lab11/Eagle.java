package lab11;


public class Eagle implements MoveAble,FlyAble {
    private int speed;

    public Eagle(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public int speed() {
        return speed;
    }
}
