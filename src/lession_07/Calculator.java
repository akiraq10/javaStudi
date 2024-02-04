package lession_07;

public class Calculator {
    //Overloading:Same class, Compile time
    //Overriding: Inheritance(OOP), Run time
    public  static int sum(int num1 ,int num2){
        return num1+num2;
    }
    //overloading
    public  static int sum(int num1 ,int num2,int num3,int num4){
        return num1+num2+num3+num4;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }

}
