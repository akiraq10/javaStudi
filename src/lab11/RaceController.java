package lab11;

import java.util.List;
import java.util.Objects;

public class RaceController {

    public MoveAble printWinner(List<MoveAble> moveAbleList){
        MoveAble winner= moveAbleList.get(0);
        for (MoveAble moveAble : moveAbleList) {
            if (winner.speed()>moveAble.speed())
            {
                winner=moveAble;
            }
        }
        return winner;
    }
    public FlyAble printWinner1(List<FlyAble> flyAbleList){
        FlyAble flyAble1= flyAbleList.get(0);
        for (FlyAble flyAble : flyAbleList) {
            if (flyAble.fly()==true){
                flyAble1=flyAble;

            }
        }

        return flyAble1;
    }




}
