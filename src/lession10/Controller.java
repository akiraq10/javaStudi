package lession10;

import java.util.List;

public class Controller {
    public static int totalSalary(List<Employee> employeeList){
        int totalSalary=0;
        for (Employee employee : employeeList) {
            totalSalary+=employee.getSalary()+ employee.getSupportSalary();
        }
        return totalSalary;
    }
    public static void salaryOfEachEmployee(List<Employee> employeeList){
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

    }
}
