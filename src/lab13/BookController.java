package lab13;

import lession13.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BookController {
    private static final String SEPARATOR=",";
    public static void addNewBook(List<Book> bookList,String dataPath) throws IOException {

        if (bookList == null || dataPath ==null){
            throw new IllegalArgumentException("Person List or file path is null");
        }
        if (bookList.isEmpty()) return;

        saveData(bookList,dataPath);
    }
    public static void addNewBook2(Book book,String dataPath) throws IOException {

        if (book == null || dataPath ==null){
            throw new IllegalArgumentException("Person List or file path is null");
        }

        saveData2(book,dataPath);
    }

    public static void updateBook(int ISBN,Book newbook,String dataPath) throws IOException {
        List<Book> bookList;
        bookList=readData(dataPath);
        Book bookObject = null;
        for (Book book : bookList) {
            if(book.getISBN()== ISBN){
//                book.setISBN(newbook.getISBN());
                bookObject=book;
                book.setTitle(newbook.getTitle());
                book.setAuthor(newbook.getAuthor());
                book.setYear(newbook.getYear());
                break;
            }
        }
        try {
            if (bookObject!=null){
                saveData(bookList,dataPath);
                System.out.println("the book ID: " + ISBN + " is updated success");
            }else System.out.println("the book ISBN does not existing");

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void deleteBook(String bookName,String dataPath) throws IOException {
        List<Book> bookList;
        bookList=readData(dataPath);
        Book bookObject = null;
        for (Book book : bookList) {
            if(Objects.equals(book.getTitle(), bookName)){
                bookObject=book;
                bookList.remove(book);
                break;
            }
        }
        try {
            if (bookObject!=null){
                saveData(bookList,dataPath);
                System.out.println("the book: " + bookName + " is deleted success");
            }else System.out.println("the book name does not existing");

        }catch (Exception e) {
            e.printStackTrace();
        }

    }




    public static void findBook(int ISBN, String dataPath) throws IOException {
        List<Book> bookList;
        Book bookObject = null;
        bookList=readData(dataPath);
        for (Book book : bookList) {
            if (book.getISBN()==ISBN){
               bookObject=book;
               break;
            }

        }
        if (bookObject!=null) {
            System.out.println(bookObject);
        }else System.out.println("The ISBN: " + ISBN + " Not found");


    }

    public static void viewBookStore(String dataPath) throws IOException {
        System.out.println(readData(dataPath));
    }
    private static void saveData(List<Book> bookList,String dataPath) throws IOException {
        FileOutputStream fileOutputStream =new FileOutputStream(dataPath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        for (Book book : bookList) {
            int bookID=book.getISBN();
            String bookTitle=book.getTitle();
            String bookAuthor=book.getAuthor();
            int year=book.getYear();
            String dataLine= String.valueOf(bookID).concat(SEPARATOR)
                    .concat(bookTitle).concat(SEPARATOR)
                    .concat(bookAuthor).concat(SEPARATOR)
                    .concat(String.valueOf(year));
            bufferedWriter.write(dataLine);
            bufferedWriter.newLine();
        }
        if (bufferedWriter !=null){
            bufferedWriter.close();
        }
    }

    private static void saveData2(Book book,String dataPath) throws IOException {
        FileOutputStream fileOutputStream =new FileOutputStream(dataPath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        int bookID=book.getISBN();
        String bookTitle=book.getTitle();
        String bookAuthor=book.getAuthor();
        int year=book.getYear();
        String dataLine= String.valueOf(bookID).concat(SEPARATOR)
                .concat(bookTitle).concat(SEPARATOR)
                .concat(bookAuthor).concat(SEPARATOR)
                .concat(String.valueOf(year));
        bufferedWriter.write(dataLine);
        bufferedWriter.newLine();
        if (bufferedWriter !=null){
            bufferedWriter.close();
        }
    }
    private static List<Book> readData(String dataPath) throws IOException {
        List<Book> bookList=new ArrayList<>();
        if(dataPath == null){
            throw new IllegalArgumentException("file path can't be null");
        }else {

            System.out.println("Reading data from: ".concat(dataPath));
            FileInputStream fileInputStream = new FileInputStream(dataPath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String dataLine = bufferedReader.readLine();
            while (dataLine!=null){
                String[] bookData=dataLine.split(SEPARATOR);
                int bookID = Integer.parseInt(bookData[0]);
                String bookName= bookData[1];
                String bookAuthor=bookData[2];
                int year=Integer.parseInt(bookData[3]);
                Book book=new Book(bookID,bookName,bookAuthor,year);
                bookList.add(book);
                dataLine = bufferedReader.readLine();
            }
        }

        return  bookList;
    }

}
