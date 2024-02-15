package lession10_1;

import javax.swing.*;

public class loginTestFlow {
    private String userName;
    private String pwd;

    public loginTestFlow(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
    public void loginWithCred(LoginPage loginPage){
        loginPage.login(userName, pwd);
    }
}
