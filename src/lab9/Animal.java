package lab9;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {
    private String name;
    private boolean hasWings;
    private int speed;

    protected Animal(Builder builder){
        this.name= builder.name;
        this.hasWings= builder.hasWings;
        this.speed= builder.speed;

    }

    public String getName() {
        return name;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public int getSpeed() {
        return speed;
    }
    public Animal getWinner(List<Animal> animalList){
        Animal winner= animalList.get(0);
        List<Animal> raceAbleAnimal= getAnimalRacer(animalList);
        for (Animal animal : raceAbleAnimal) {
            if (animal.getSpeed()>winner.getSpeed()) {
                winner=animal;
            }

        }
        System.out.println("The winner: " + winner.getName());
        System.out.println("Speed: "+ winner.getSpeed());

        return this;
    }


    private List<Animal> getAnimalRacer(List<Animal> animalList) {
        List<Animal> hasWing=new ArrayList<>();
        for (Animal animal : animalList) {
           if (animal.isHasWings()==false){
               hasWing.add(animal);
           }
        }
        return hasWing;
    }

    public static class Builder{
        private String name;
        private boolean hasWings;
        private int speed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setHasWings(boolean hasWings) {
            this.hasWings = hasWings;
            return this;

        }

        public Builder setSpeed(int speed) {
            this.speed = new SecureRandom().nextInt(speed);
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }



}
