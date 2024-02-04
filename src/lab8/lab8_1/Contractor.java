package lab8.lab8_1;

public class Contractor extends Employee{
    public Contractor(String name, int id) {
        super(name, id);
    }

    @Override
    public int getSalary() {
        return 40000;
    }
}
