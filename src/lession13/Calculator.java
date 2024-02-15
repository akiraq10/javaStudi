package lession13;

public class Calculator {
    public static int divide(int a, int b){
        return a/b ;

    }

    public static void main(String[] args) {
        int a=4;
        int b=0;
        int result= Calculator.divide(a,b);
        System.out.println(result);
    }
}
