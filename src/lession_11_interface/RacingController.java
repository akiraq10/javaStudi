package lession_11_interface;

import lab8.lab8_2.RaceController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingController {
    public MoveAble printOutTheWinner(List<MoveAble> moveAblesObject){
        MoveAble winner=moveAblesObject.get(0);
//        for (MoveAble moveAbleObject : moveAblesObject) {
//            if(moveAbleObject.move());
//
//        }
        return winner;
    }

    public static void main(String[] args) {
        MoveAble superMan=new SuperMan();
        MoveAble dog=new Dog();
        new RacingController().printOutTheWinner(Arrays.asList(superMan,dog));
    }
}
