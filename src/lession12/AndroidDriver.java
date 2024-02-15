package lession12;

public class AndroidDriver extends AppiumDriver{
    @Override
    protected AppiumDriver init() {
        System.out.println("Init Android driver");
        return null;
    }

    @Override
    protected void quit() {
        System.out.println("Quit Android driver");
    }
}
