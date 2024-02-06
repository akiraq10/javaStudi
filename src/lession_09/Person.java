package lession_09;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      isCheckAge(age);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //public goi la service method

    public void setAge(int age) {
        isCheckAge(age);
        this.age = age;
    }

    //private goi la support method
    private void isCheckAge(int age){
        if ( age<0){
            System.out.println("nhap sai roi ku");
            return;
        }
    }
}
