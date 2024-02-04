package lab8.lab8_1;

import java.util.List;

public class Controller {
    public static int totalSalary(List<Employee> employeeList){
        int totalSalary=0;
        for (Employee employee : employeeList) {
            totalSalary=totalSalary+employee.getSalary();
        }
        return totalSalary;
    }
    public static void salaryOfEachEmployee(List<Employee> employeeList){
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

    }
}
