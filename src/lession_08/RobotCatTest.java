package lession_08;

public class RobotCatTest {

    //Models
    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();


        System.out.println(batteryRobotCat.charge());
        solarRobotCat.setName("solarRobotCat");
        System.out.println(solarRobotCat.charge());

        System.out.println(batteryRobotCat);
        System.out.println(solarRobotCat);

    }
}
