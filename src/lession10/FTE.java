package lession10;

public class FTE extends Employee {
    public FTE(String name, int id) {
        super(name, id);
    }

    @Override
    public int getSalary() {
        return super.salary + 50000;
    }
    public  int getSupportSalary(){
        return 5000;
    }
}
