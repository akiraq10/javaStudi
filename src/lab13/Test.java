package lab13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        String dataFileAbsolutePath = System.getProperty("user.dir") + "/src/lab13/BookStore.txt";
//        Book book1 = new Book(1, "abc1", "kkk1", 1991);
//        Book book2 = new Book(2, "abc2", "kkk2", 1992);
//        Book book3 = new Book(3, "abc3", "kkk3", 1993);
//        Book book4 = new Book(4, "abc4", "kkk4", 1994);
        Book book5 = new Book(5, "abc5", "kkk5", 1995);
        List<Book> bookList=new ArrayList<>();
//


        int userOption;

        boolean isContinuting = true;

        while (isContinuting) {
            printMenu();
            userOption = getUserOption();
            switch (userOption) {
                case 1:
                    bookList.add(newBook());
                    BookController.addNewBook(bookList,dataFileAbsolutePath);

                    break;
                case 2:
                    System.out.println("Please enter the ISBN");
                    BookController.findBook(new Scanner(System.in).nextInt(),dataFileAbsolutePath);
                    break;
                case 3:
                    System.out.println("Please enter the ISBN");
                    int ISBN =new Scanner(System.in).nextInt();
                    BookController.updateBook(ISBN, newBookInfo(ISBN), dataFileAbsolutePath);
                    break;
                case 4:
                    System.out.println("Please enter the book name");
                    BookController.deleteBook(new Scanner(System.in).nextLine(),dataFileAbsolutePath);
                    break;
                case 5:
                    BookController.viewBookStore(dataFileAbsolutePath);
                    break;
                case 0:
                    isContinuting = false;
                    System.out.println("See u late");
                    break;
                default:
                    System.out.println("nhap sai roi nhap lai đi");

            }

        }


    }

    private static void printMenu() {
        System.out.println("====BookStore Manager Program (GRUD) ===");
        System.out.println("1. Add new book");
        System.out.println("2. Find a book ( ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0.  Exist!!!!");
    }

    private static int getUserOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        return scanner.nextInt();
    }
    private static Book newBook(){
        System.out.print("Please enter ISBN");
        int ISBN= new Scanner(System.in).nextInt();
        System.out.print("Please enter book name");
        String bookName= new Scanner(System.in).nextLine();
        System.out.print("Please enter Author");
        String author=new Scanner(System.in).nextLine();
        System.out.print("Please enter the Year");
        int year=new Scanner(System.in).nextInt();
        return new Book(ISBN,bookName,author,year);
    }
    private static Book newBookInfo(int ISBN){
        System.out.print("Please enter new book name");
        String bookName= new Scanner(System.in).nextLine();
        System.out.print("Please enter Author");
        String author=new Scanner(System.in).nextLine();
        System.out.print("Please enter the Year");
        int year=new Scanner(System.in).nextInt();
        return new Book(ISBN,bookName,author,year);
    }

}
