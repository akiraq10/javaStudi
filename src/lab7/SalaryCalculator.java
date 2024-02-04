package lab7;

public class SalaryCalculator {
    public static void main(String[] args) {
        FTE fte =new FTE();
        Contractor contractor = new Contractor();

        int totalFTE=3;
        int totalContractor=2;


        //Total  monthly salary of cty
        int totalSalary = fte.Salary()*totalFTE + contractor.salary()*totalContractor;
        System.out.println("Total salary: " + totalSalary);
    }

    //total monthly salary
}
