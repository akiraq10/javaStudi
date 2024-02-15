package lession10_1;

public class InternalLoginPage extends LoginPage{
    private final String USERNAME_SEL="#username";
    private final String PASSWORD_SEL="#password";
    private final String LOGIN_BTN_SEL="#btn";
    @Override
    public void inputUser(String username) {
        System.out.printf("Login with user name as %s and locator as %s \n",username,USERNAME_SEL);
    }

    @Override
    public void inputPassword(String pwd) {
        System.out.printf("Login with password as %s and locator as %s \n",pwd,PASSWORD_SEL);
    }

    @Override
    public void clickOnLoginBtn() {
        System.out.printf("Login with btn  locator as %s \n",LOGIN_BTN_SEL);

    }
}
