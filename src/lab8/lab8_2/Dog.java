package lab8.lab8_2;

import java.security.SecureRandom;

public class Dog extends Animal{
    public Dog(String nameAnimal) {
       super(nameAnimal,new SecureRandom().nextInt(60));
    }
}
