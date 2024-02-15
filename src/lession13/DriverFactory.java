package lession13;

import java.util.Arrays;

public class DriverFactory {
     public static AppiumDriver initAppiumDriver(PlatformType platformType){
         AppiumDriver driver;
         switch (platformType){
             case IOS :
                 driver=new IOSDriver();

                 break;
             case ANDROID:
                 driver=new AndroidDriver();
                 break;
             default:
                 throw  new IllegalArgumentException("We just support: "+ Arrays.toString(PlatformType.values()));
         }
         return driver;

     }
}
