package lab2;

import java.util.Scanner;

public class Lab2_3 {
    public static void main(String[] args) {
        float weight ;
        float height ;
        float BMI;
        double weightSuggest;

        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter your weight: ");
        weight=scanner.nextFloat();
        System.out.print("Please enter your height");
        height=scanner.nextFloat();

        BMI =weight / (height*2);

        if (BMI <=18.5) {
            System.out.println("Underweight");
            weightSuggest= ((18.5-BMI) *(height*2));
            System.out.println("you must increase: "+ weightSuggest + "kg");
        } else if (BMI<=24.9) {
            System.out.println("Normal weight");
        }else if (BMI<=29.9){
            System.out.println("Overweight");
            weightSuggest= ((BMI-24.9) *(height*2));
            System.out.println("you must decrease: "+ weightSuggest+ "kg");
        }else {
            System.out.println("Obesity");
            weightSuggest= ((BMI-24.9) *(height*2));
            System.out.println("you must decrease: "+ weightSuggest+ "kg");
        }
    }

}
