package lession_2;

import java.util.Scanner;

public class BitWiseOperator {
    public static void main(String[] args) {

        /*
         * && : true && true
         * ||: true || false, false || true ,
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("please input 1st: ");
        int firstNumber = scanner.nextInt();
//        System.out.print("please input 2rd: ");
//        int secondNumber = scanner.nextInt();

        // Bitwise operator
        if (firstNumber != 0 & getSecondNum() != 0) {
            System.out.printf("%d/%d=%d", firstNumber, 2, firstNumber / 2);

        }


    }
    private static int getSecondNum(){
        System.out.println("Evaluate right operand");
        return 2;
    }
}
