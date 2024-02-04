package lession_08;

import java.util.Arrays;
import java.util.List;

public class RobotCatController {
    public void chargeRobot(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }

    public static void main(String[] args) {
        //Models | Controllers |Data (Objects)
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();
        RobotCat windRobotCat=new WindRobotCat();
        List<RobotCat> robotCatList = Arrays.asList(batteryRobotCat,solarRobotCat,windRobotCat);

        RobotCatController robotCatController =new RobotCatController();
        robotCatController.chargeRobot(robotCatList);


    }
}
