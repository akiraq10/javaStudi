package lab8.lab8_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RaceController {
    public void animalSpeed(List<Animal> animalList){

        Animal winner= animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getAnimalSpeed()> winner.getAnimalSpeed()) {
                winner=animal;
            }
        }

        System.out.println(winner);


    }

}
