package lession_03;

public class ArrayLearning {
    public static void main(String[] args) {
        final int ARRAY_LENGTH=5;
        int[] myIntArray=new int[ARRAY_LENGTH];
        //print out values
//        for (int index = 0; index < 5; index++) {
//            myIntArray[index]=index++;
//        }
        //Iterate
        /**
         * arr[0]=0 --> index =1 --> index=2
         * arr[2]=2 --> index =3 --> index=4
         * arr[4]=4 --> index=5 --> index =6
         *
         * 0,,2,,4
         */


         for (int index = 0; index < 5; index++) {
            myIntArray[index]=index+1;
        }


//        for (int index = 0; index < ARRAY_LENGTH; index++) {
//            System.out.println(myIntArray[index]);
//        }

//        for (int value : myIntArray) {
//            System.out.println(value);
//        }
        for (int arrayLength = ARRAY_LENGTH-1; arrayLength >= 0; arrayLength--) {
            System.out.println(myIntArray[arrayLength]);
        }


    }
}
