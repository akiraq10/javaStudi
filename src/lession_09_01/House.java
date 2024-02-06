package lession_09_01;
/*
*Design Pattern (kieu thiet ke giai quyet 1 bai toan)
*1. Builder Design Pattern
 */

public class House {

    private String color = "White";
    private int mainDoors = 1;
    private int windows = 4;
    private String topRoofColor = "red";

    public House() {
    }
    //    public House(String color, int mainDoors, int windows, String topRoofColor) {
//        if(color!=null){
//            this.color = color;
//        }
//        if (mainDoors!=1) {
//            this.mainDoors = mainDoors;
//        }
//        if (windows!=4) {
//            this.windows = windows;
//        }
//
//        if (topRoofColor!=null) {
//            this.topRoofColor = topRoofColor;
//        }
//
//    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMainDoors(int mainDoors) {
        this.mainDoors = mainDoors;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setTopRoofColor(String topRoofColor) {
        this.topRoofColor = topRoofColor;
    }

    // Immutable object

    public static void main(String[] args) {
        House house =new House();
        house.setColor("Pink");
    }
}


