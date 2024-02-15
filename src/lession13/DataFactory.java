package lession13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {
    public static final String SEPARATOR="|";

    public static  void savePersonList(List<Person> personList, String filePath) throws IOException {
        if (personList == null || filePath ==null){
            throw new IllegalArgumentException("Person List or file path is null");
        }
        if (personList.isEmpty()) return;

        FileOutputStream fileOutputStream =new FileOutputStream(filePath);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        for (Person person : personList) {
            String personName= person.getName();
            int personAge=person.getAge();
            String dataLine= personName.concat(SEPARATOR).concat(String.valueOf(personAge));
            bufferedWriter.write(dataLine);
            bufferedWriter.newLine();

        }
        if (bufferedWriter !=null){
            bufferedWriter.close();
        }
    }
    public static List<Person> convertDataIntoList(String filePath){
        List<Person> personList=new ArrayList<>();
        if(filePath == null){
            throw new IllegalArgumentException("file path can't be null");
        }else {

            System.out.println( "Reading data from: ".concat(filePath));
            try ( FileInputStream fileInputStream = new FileInputStream(filePath);
                  InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                  BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                  )
            {
                String dataLine = bufferedReader.readLine();
                while (dataLine!=null){
                    String[] personData=dataLine.split(SEPARATOR);
                    String personName=personData[0];
                    int personAge=Integer.parseInt(personData[1]);
                    Person person = new Person(personName,personAge);
                    personList.add(person);
                    dataLine = bufferedReader.readLine();
                }


            } catch (Exception e){
               e.printStackTrace();
            }
        }
        return personList;
    }
}
