package lession_05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListLearning_02 {
    public static void main(String[] args) {
        List<Integer> myArrayList=new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(4);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(3);

        //lay 3 gia tri dau tien nho nhat va ko trung | expected output : 1 , 2, 3
        //Ascending
        Set<Integer> set = new HashSet<>(myArrayList); // sort and  remote duplicate values
        System.out.println(set);
        List<Integer> arrayListWithSet= new ArrayList<>(set); //chuyen tu set qua arraylist


        //Exclusive
        List<Integer> first3MinValue=arrayListWithSet.subList(0,3);
        System.out.println(first3MinValue);

    }
}
