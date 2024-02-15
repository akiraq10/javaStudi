package lession11;

public class Animal {
    String name;
    int speed;
    public Animal(){

    }
    public Animal(int speed){
        this.speed=speed;
    }
    //support method
     String addAnimalPrefix(){
        return "My name is " + this.name;
    }


}
