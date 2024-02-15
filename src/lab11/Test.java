package lab11;

import lession_11_interface.RacingController;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    static int MAX_SPEED=50;
    public static void main(String[] args) {
        MoveAble dog = new Dog(MAX_SPEED);
        MoveAble horse = new Horse(MAX_SPEED);
        FlyAble eagle= new Eagle(MAX_SPEED);



    }
}
