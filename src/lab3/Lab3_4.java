package lab3;

import java.util.Arrays;

public class Lab3_4 {
    public static void main(String[] args) {
        int[] myArray1={1,423,6,46,34,23,13,53,4};
        int[] myArray2={7,3,4,6,1};
        int[] newArray=new int[myArray1.length+myArray2.length];
        for (int index = 0; index < myArray1.length; index++) {
            newArray[index]=myArray1[index]; // Add array1 to new array

        }
        for (int index : newArray) {
            System.out.printf("%d \n", index);
        }
        for (int i = 0; i < myArray2.length; i++) {
            newArray[myArray1.length+i]=myArray2[i]; //add array2 to new array begin form local array 1 + 1
        }
        Arrays.sort(newArray);
        for (int i : newArray) {
            System.out.printf("%d \t",i);
        }

    }
}
