package Lab6;

public class lab6_1 {
    public static void main(String[] args) {
        String timeStr="2hrs and 5 minutes";
        String hStr=timeStr.substring(0,1);
        String mStr=timeStr.substring(9,10);
        int hour=Integer.parseInt(hStr);
        int minute=Integer.parseInt(mStr);
        System.out.println(timeStr);
        System.out.println("Total minute: " + (hour * 60 + minute));


    }
}
