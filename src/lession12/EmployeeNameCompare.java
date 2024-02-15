package lession12;

import java.util.Comparator;

public class EmployeeNameCompare implements Comparator<Employee> {
    @Override
    public int compare(Employee thisEmploy, Employee thatEmploy) {

        return thisEmploy.getName().compareToIgnoreCase(thatEmploy.getName());
    }
}
