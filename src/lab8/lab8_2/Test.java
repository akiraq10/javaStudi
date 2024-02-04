package lab8.lab8_2;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal dog=new Dog("gau gau");
        Animal tiger=new Tiger("gao gao");
        Animal horse=new Horse("hi hi");
        List<Animal> animalList= Arrays.asList(dog,tiger,horse);

        new RaceController().animalSpeed(animalList);


    }
}
