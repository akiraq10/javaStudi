package lab4;

import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        List<Integer> myArrayList=new ArrayList<>();

        int userOption;

        boolean isContinuting =true;

        while (isContinuting) {
            printMenu();
            userOption=getUserOption();
            switch (userOption) {
                case 1:
                    addNumberIntoArray(myArrayList);
                    break;
                case 2:
                    printNumber(myArrayList);
                    break;
                case 3:
                    getMaximunNumber(myArrayList);
                    break;
                case 4:
                    getMinumunNumber(myArrayList);
                    break;
                case 5:
                    searchNumber(myArrayList);
                    break;
                case 0:
                    isContinuting=false;
                    System.out.println("See u late");
                    break;
                default:
                    System.out.println("nhap sai roi nhap lai đi");

            }

        }


    }
    private static void printMenu () {
        System.out.println("====Game Menu===");
        System.out.println("1. Add number to Array List");
        System.out.println("2.  Print menu");
        System.out.println("3.  Get Maximum number");
        System.out.println("4.  Get Minimum number");
        System.out.println("5.  Search number");
        System.out.println("0.  Exist!!!!");
    }
    private static int getUserOption() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }
    private static void addNumberIntoArray (List<Integer> yourList) {
        System.out.println("Enter your value");
        yourList.add(new Scanner(System.in).nextInt());

    }


    private static void printNumber (List<Integer> yourList) {
        if(!yourList.isEmpty()){
            Collections.sort(yourList);
            System.out.println("Your Array List value: "+ yourList);

        }else{
            System.out.println("list is empty , please add the vaule to list");
        }
//        String result = !yourList.isEmpty()? Collections.sort(yourList) && "Your Array List value: "+ yourList: "list is empty , please add the vaule to list" ;

    }
    private static void getMaximunNumber (List<Integer> yourArrayList) {

        String  result = !yourArrayList.isEmpty() ? "Your maximum value: "+yourArrayList.getLast():"the list is empty, Pls add value to list before";
        System.out.println(result);

    }

    private static void getMinumunNumber (List<Integer> yourArrayList) {
        String  result = !yourArrayList.isEmpty() ? "Your maximum value: "+yourArrayList.getLast():"the list is empty, Pls add value to list before";
        System.out.println(result);
    }




    private static void searchNumber (List<Integer> yourArrayList) {
        System.out.println("Enter the number to search");
        int value=new Scanner(System.in).nextInt();

//        if (yourArrayList.isEmpty()){
//            System.out.println("list is empty. Pls check your list before search");
//
//        } else if (!yourArrayList.contains(value)) {
//
//            System.out.println("your number not exist");
//
//        }
//        else System.out.println("your number is exsiting");

        String result= yourArrayList.isEmpty() ? "list is empty. Pls check your list before search":
                !yourArrayList.contains(value) ? "your number not exist":
                        "your number is exsiting";
        System.out.println(result);
    }
}

