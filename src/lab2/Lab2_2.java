package lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Pls enter a number: ");
        userNumber=scanner.nextInt();

        if (userNumber%2==0){
            System.out.printf("%d la so chan",userNumber);
        }else {
            System.out.printf("%d la so le ",userNumber);
        }

    }
}
