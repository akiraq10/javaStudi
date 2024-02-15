package lession13;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DataFactoryTest  {
    public static void main(String[] args) throws IOException {
        Person teo= new Person("teo", 20);
        Person ty= new Person("ty", 22);
        List<Person> people= Arrays.asList(teo,ty);
        String dataFileAbsolutePath=System.getProperty("user.dir") +"/src/lession13/people.txt";
        DataFactory.savePersonList(people,dataFileAbsolutePath);

        List<Person> personList = DataFactory.convertDataIntoList(dataFileAbsolutePath);
        System.out.println(personList);
    }
}
