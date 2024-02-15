package lession12;

import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employeesList;
        Employee teo=new Employee();
        Employee ty=new Employee();
        Employee tun=new Employee();
        teo.setSalary(20);
        teo.setAge(20);
        teo.setName("teo");

        ty.setSalary(30);
        ty.setAge(18);
        ty.setName("ty");

        tun.setSalary(15);
        tun.setAge(30);
        tun.setName("tun");
        employeesList = Arrays.asList(teo,ty,tun);

        System.out.println("Before Sorting");
        System.out.println(employeesList);

        System.out.println("After Sorting");
        Collections.sort(employeesList);
        System.out.println(employeesList);

        System.out.println("SORT BY AGE");
        employeesList.sort(new EmployeeAgeCompare());
        System.out.println(employeesList);

        System.out.println("SORT BY Name");
        employeesList.sort(new EmployeeNameCompare());
        System.out.println(employeesList);


    }
}
