package lession_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {
    public static void main(String[] args) {
        int randomNum = new SecureRandom().nextInt(10);
        int guessingTime = 0;


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input the number: ");
            int userNum = scanner.nextInt();

            if (userNum == randomNum) {
                System.out.println("Successfully");
                break;
            }

            guessingTime++;

        } while (guessingTime < 3);
        System.out.println("the random number: " + randomNum);
        if (guessingTime == 3) {
            System.out.println("chuc ban may man lan sau");
        }
    }
}
