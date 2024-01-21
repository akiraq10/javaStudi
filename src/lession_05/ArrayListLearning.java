package lession_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {
        //CRUD | Create, Read , Update, Delete

        //Create
        List<Integer> myList=new ArrayList<>();
        ArrayList<Integer> arrayList =new ArrayList<>();//ko nen dùng
        myList.add(1);
        myList.add(2);
        myList.add(5);
        // 1 ,2 ,5
        int insertIndex=2;
        int insetValue=3;
        myList.add(insertIndex,insetValue);

        //Read
        System.out.println(myList);

        for (int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }

        for (Integer value : myList) {
            System.out.println(value);
        }

        //update
        myList.set(3,4);

        //delete
        myList.remove(3);//remove theo index

        // is empty or not
        // False Negative
        if (myList.isEmpty()){
            //Assert.fail("no zyx elements to test")
        }
        for (Integer value : myList) {
            //verify base on value
        }

        System.out.println(myList.contains(10));
        System.out.println(myList.indexOf(1));


//        List<Integer> myList_ = Arrays.asList(1,2,3);//Update dc value, nhung ko add or remove doi dc so phan tu




        //Raw type : don't use in working
//        List myRawList=new ArrayList();
//        myRawList.add(1);
//        myRawList.add(true);
//        myRawList.add(3.14f);


    }
}
