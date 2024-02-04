package lab8.lab8_2;

import java.security.SecureRandom;

public class Animal {

    String nameAnimal;
    int animalSpeed ;
    public Animal() {
    }

    public Animal(String nameAnimal, int animalSpeed) {
        this.nameAnimal = nameAnimal;
        this.animalSpeed = animalSpeed;
    }



    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public int getAnimalSpeed() {
        return animalSpeed;
    }

    public void setAnimalSpeed(int animalSpeed) {
        this.animalSpeed = animalSpeed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", animalSpeed=" + animalSpeed +
                '}';
    }
}
