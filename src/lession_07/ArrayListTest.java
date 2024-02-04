package lession_07;

import utils.ArrayListHelper;

import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> myArrList= Arrays.asList(1,2,3,4);
        int minValue = ArrayListHelper.findMinValue(myArrList);
        int maxValue= ArrayListHelper.findMaxValue(myArrList);
        System.out.println(minValue);
        System.out.println(maxValue);
    }
}
