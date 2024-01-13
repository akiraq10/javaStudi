package lab2;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        int weight ;
        float height ;
        float BMI;
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter your weight: ");
        weight=scanner.nextInt();
        System.out.print("Please enter your height");
        height=scanner.nextFloat();
        BMI =weight / (height*2);
        if (BMI <=18.5) {
            System.out.println("Underweight");

        } else if (BMI<=24.9) {
            System.out.println("Normal weight");

        }else if (BMI<=29.9){
            System.out.println("Overweight");
        }else {
            System.out.println("Obesity");
        }

    }
}
