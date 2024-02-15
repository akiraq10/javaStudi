package lession11;

public class Dog extends  Animal{
    public Dog(int speed){
        super(speed);
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    @Override
    public String addAnimalPrefix() {
        return super.addAnimalPrefix();
    }
}
