package lession10_1;

public abstract class LoginPage {
    public abstract void inputUser(String username);
    public abstract void inputPassword(String pwd);
    public abstract void clickOnLoginBtn();
    public void login(String username,String pwd){
        inputUser(username);
        inputPassword(pwd);
        clickOnLoginBtn();
    }

}
