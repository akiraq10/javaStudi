package lession10_1;

public class LoginTest {
    public static void main(String[] args) {
        loginTestFlow testFlow=new loginTestFlow("teo","teocodon");
        LoginPage internalLoginPage=new InternalLoginPage();
        LoginPage externalLoginPage=new ExternalLoginPage();
        testFlow.loginWithCred(internalLoginPage);
        testFlow.loginWithCred(externalLoginPage);
        }
}
