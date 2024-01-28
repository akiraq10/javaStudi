package lession_06;

import java.util.Arrays;

public class StringLearning2 {
    public static void main(String[] args) {
        //Immutable

        String badWordsContainers="   bad, very bad, sth else, bad!!!                 ";
        String fillerStr= badWordsContainers.replace("bad","b**");

        String trimSpace= fillerStr.trim();
        System.out.println(fillerStr);
        System.out.println(trimSpace);

        //Substring, indexOf, split
        String url="https://google.com";
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));

        System.out.println("this is index of: "+ url.indexOf("o"));
        System.out.println("this is index of: "+ url.indexOf("https"));


        String[] splitStr=url.split("o");
        System.out.println("this is split"+Arrays.toString(splitStr));

        //RegularExpression | Regex
        String cookingTimeStr= "105mins 2hrs";
        String cookingTimeNumStr=cookingTimeStr.replaceAll("[^0-9]","");
        System.out.println(cookingTimeNumStr);


    }
}
