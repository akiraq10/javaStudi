package lab3;

import java.util.Arrays;

public class Lab3_3 {
    public static void main(String[] args) {
        int[] a={1,423,6,46,34,23,13,53,4};


        //Implemented inbuilt function to sort array
        Arrays.sort(a);
        for (int i : a) {
            System.out.printf("%d \t",i);
        }
    }
}
