package lab8.lab8_2;

import java.security.SecureRandom;

public class Horse extends Animal{


    public Horse(String nameAnimal) {
        super(nameAnimal,new SecureRandom().nextInt(60));
    }
}
