package lab8.lab8_1;

import java.util.Arrays;
import java.util.List;

import static lab8.lab8_1.Controller.salaryOfEachEmployee;
import static lab8.lab8_1.Controller.totalSalary;

public class Test {
    public static void main(String[] args) {
        Employee fte1=new FTE("fte1",1);
        Employee fte2=new FTE("fte2",2);
        Employee fte3=new FTE("fte3",3);
        Employee contractor1=new Contractor("Contractor1",1);
        Employee contractor2 =new Contractor("Contractor2",2);
        List<Employee> employeeList= Arrays.asList(fte1,fte2,fte3,contractor1,contractor2);
        salaryOfEachEmployee(employeeList);
        System.out.println("Total: "+ totalSalary(employeeList));

    }
}
