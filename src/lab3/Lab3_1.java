package lab3;

import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        int[] myIntArray={1,2,3,4,5,6};
        int[] soChan = new int[myIntArray.length];
        int[] soLe =new int[myIntArray.length];

        for (int i = 0; i < myIntArray.length; i++) {

            if(myIntArray[i]%2==0){
                System.out.printf("so chan %d \n",myIntArray[i]);


            }
            else {
                System.out.printf("so le %d \n",myIntArray[i]);
            }
        }



    }
}
