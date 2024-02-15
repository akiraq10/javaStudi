package lession13;

public class DriverFactoryTest {
    public static void main(String[] args) {

           AppiumDriver  driver=null;
           try {
               driver= DriverFactory.initAppiumDriver(PlatformType.IOS);
               driver.initDriver();
           }catch (Exception e){
               e.printStackTrace();
           }finally {
               if (driver!=null)driver.closeDriver();

           }


    }
}
