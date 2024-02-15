package lession10;



import java.util.Arrays;
import java.util.List;

import static lession10.Controller.salaryOfEachEmployee;
import static lession10.Controller.totalSalary;


public class Test {
    public static void main(String[] args) {
        Employee fte1= new FTE("fte1",1);
       Employee fte2= new Employee("fte2",2);
        Employee fte3=new FTE("fte3",3);
        Employee contractor1= new Employee("Contractor1",1);
       Employee contractor2 =new Contractor("Contractor2",2);
        List<Employee> employeeList= Arrays.asList(fte1,contractor2);
        salaryOfEachEmployee(employeeList);
        System.out.println("Total: "+ totalSalary(employeeList));

    }
}
