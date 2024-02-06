package lession_09_01;


import java.util.ArrayList;
import java.util.List;

public class BuilderTEst {
    public static void main(String[] args) {
        HouseWithBuilder.Builder builder =new HouseWithBuilder.Builder();

        //Method chaining
        builder
                .setColor("Pink")
                .setMainDoors(10)
                .setWindows(1);

        HouseWithBuilder house=builder.build();
        System.out.println(house.getColor());
        System.out.println(house.getMainDoors());

        List<HouseWithBuilder> houseList=new ArrayList<>();
        houseList.add(house);
        houseList.add(house);
        houseList.add(house);
        houseList.add(house);

        for (HouseWithBuilder houseWithBuilder : houseList) {
            System.out.println(houseWithBuilder.getColor());
        }

    }
}
