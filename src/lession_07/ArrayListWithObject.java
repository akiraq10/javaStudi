package lession_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithObject{
    public static void main(String[] args) {
        List<RobotCat> robotCatsList=new ArrayList<>();
        RobotCat meomeo=new RobotCat("meomeo",1);
        robotCatsList.add(meomeo);
        robotCatsList.add(meomeo);
        robotCatsList.add(meomeo);
        robotCatsList.add(meomeo);
        System.out.println("RoboCat list size: "+robotCatsList.size());
        robotCatsList.get(robotCatsList.size()-1).setName("doremon");
        System.out.println(robotCatsList.get(robotCatsList.size() - 1).getName());
    }
}
