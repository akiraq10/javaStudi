package lab8.lab8_2;

import java.security.SecureRandom;

public class Tiger extends Animal{


    public Tiger(String animalName) {
        super(animalName,new SecureRandom().nextInt());
    }
}
