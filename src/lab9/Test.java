package lab9;

import javax.swing.event.ListDataEvent;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal tiger= new Animal.Builder().setName("tiger")
                .setHasWings(false)
                .setSpeed(100).build();

        Animal bird=new Animal.Builder().setName("bird")
                .setHasWings(true)
                .setSpeed(110).build();
        Animal bird2=new Animal.Builder().setName("bird2")
                .setHasWings(true)
                .setSpeed(200).build();

        Animal cat= new Animal.Builder().setName("cat")
                .setHasWings(false)
                .setSpeed(100).build();
        Animal dog= new Animal.Builder().setName("dog")
                .setHasWings(false)
                .setSpeed(100).build();

        List<Animal> animalList= Arrays.asList(tiger,bird,cat,bird2,dog);
        new Animal.Builder().build().getWinner(animalList);

    }
}
