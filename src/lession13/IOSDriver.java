package lession13;

public class IOSDriver extends AppiumDriver{
    @Override
    protected void initDriver() {
        System.out.println("init IOS driver");

    }

    @Override
    protected void closeDriver() {
        System.out.println("quit IOS Driver");

    }
}
