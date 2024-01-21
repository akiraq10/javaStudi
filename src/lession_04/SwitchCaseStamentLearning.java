package lession_04;

import java.util.Scanner;

public class SwitchCaseStamentLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number: ");
        int userNum = scanner.nextInt();
        switch (userNum) {
            case 1:
                System.out.println("giai 1");
                break;
            case 2:
                System.out.println("giai 2");
                break;
            case 3:
                System.out.println("giai 3");
                break;
            default:
                System.out.println("nhap sai roi");

        }
        switch (userNum) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("weekdays");
                break;

                case 7:
            case 8:
                System.out.println("weekends");
                break;


            default:
                System.out.println("nhap sai roi");

        }

    }
}
