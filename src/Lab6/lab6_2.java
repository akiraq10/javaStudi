package Lab6;

import java.util.Scanner;

public class lab6_2 {
    public static void main(String[] args) {
        int guessingTime = 0;
        String myPassword="password123";
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter your pwd");
            String inputPWD= scanner.next();
            if (inputPWD.equals(myPassword)){
                System.out.println("log in success");
                break;
            }else {
                System.out.println("please try again");

            }
            guessingTime++;

        }while (guessingTime<3);
        if (guessingTime==3){
            System.out.println("the account is blocker in 10 mins, Please try after 10mins");
        }
    }
}
