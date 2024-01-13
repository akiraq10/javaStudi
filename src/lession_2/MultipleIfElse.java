package lession_2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        // <18 | 18-55 | >55
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls enter your age: ");
        int clientAge = scanner.nextInt();
        if (clientAge < 18) {
            System.out.println("khong ban");
            if (clientAge<=12){
                System.out.println("calling 911..........");
            }
        } else if (clientAge <= 55) {
            System.out.println("Unlimited");
        } else {
            System.out.println(" 2chai !!!!");
        }
    }


}
