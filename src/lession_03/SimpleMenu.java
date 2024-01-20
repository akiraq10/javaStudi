package lession_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        boolean isContinuting =true;

        while (isContinuting){
            System.out.println("====Game Menu===");
            System.out.println("1. Generate random number");
            System.out.println("0.  Exit!");

            Scanner scanner=new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int userOption=scanner.nextInt();
            if (userOption==0){
                isContinuting=false;
            } else if (userOption==1) {
                System.out.printf("Your random numbeer is: %d \n", new SecureRandom().nextInt(1000));

            }else {
                System.out.println("Nhap sai roi %d");
            }

        }

    }
}
