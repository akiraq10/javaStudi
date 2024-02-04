package lession_07;

public class RobotCatTest {
    public static void main(String[] args) {
        //Call constructor to  create an object
        RobotCat robotCat=new RobotCat("mimi",1);
        System.out.println(robotCat.getName());
        robotCat.setName("meoemo");
        System.out.println(robotCat.getName());
    }
}
