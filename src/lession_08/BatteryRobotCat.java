package lession_08;

public class BatteryRobotCat extends RobotCat{


    //re-implement the parent's method
    @Override
    public String charge() {
        return super.charge() + "with electric ";
    }
}
