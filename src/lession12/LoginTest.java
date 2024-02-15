package lession12;

public class LoginTest {
    public static void main(String[] args) {
        AppiumDriver appiumDriver;

        boolean isIOS=System.getenv("platform").equalsIgnoreCase("IOS");
        if(isIOS){
            appiumDriver = new IOSDriver();
        }else {
            appiumDriver=new AndroidDriver();
        }

        appiumDriver.init();


        //Logic test
        /*
        * */

        appiumDriver.quit();

    }
}
