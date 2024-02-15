package lession13;

public class AndroidDriver extends AppiumDriver{
    @Override
    protected void initDriver() {
        System.out.println("init Android driver");

    }

    @Override
    protected void closeDriver() {
        System.out.println("quit Android Driver");

    }
}
