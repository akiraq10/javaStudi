package lession_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class FunctionLearning {
    public static void main(String[] args) {
        boolean isContinuting =true;

        while (isContinuting){
           printMenu();
            int userOption=getUserOption();

            if (userOption==0){
                isContinuting=false;
            } else if (userOption==1) {
                System.out.printf("Your random numbeer is: %d \n", new SecureRandom().nextInt(1000));

            }else {
                System.out.println("Nhap sai roi %d");
            }

        }
    }
    private static void printMenu() {
        System.out.println("====Game Menu===");
        System.out.println("1. Generate random number");
        System.out.println("0.  Exit!");
    }
    private static int getUserOption() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }




}
