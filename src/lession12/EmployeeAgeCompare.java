package lession12;

import java.util.Comparator;

public class EmployeeAgeCompare implements Comparator<Employee> {
    @Override
    public int compare(Employee thisEmploy, Employee thatEmploy) {
        return thisEmploy.getAge()- thatEmploy.getAge();
    }
}
