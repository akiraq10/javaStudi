package Lab6;

import java.util.Arrays;

public class lab6_3 {
    public static void main(String[] args) {
        String myString = "100 minutes ";
        char[] myCharArr= myString.toCharArray();
        String myNumString="";

        for (char character : myCharArr) {
            if (Character.isDigit(character)){
                myNumString = myNumString+character;
            }

        }
        System.out.println("the number: "+ myNumString);

    }
}
