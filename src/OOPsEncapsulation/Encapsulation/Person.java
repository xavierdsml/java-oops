package OOPsEncapsulation.Encapsulation;

public class Person {


    private int age;
    private String name;
    private float salary;

    //get function
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(float salary){
        this.salary = salary;
    }

    //set function
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

}
