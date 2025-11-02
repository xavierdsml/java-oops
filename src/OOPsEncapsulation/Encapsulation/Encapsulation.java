package OOPsEncapsulation.Encapsulation;

import OOPsEncapsulation.Encapsulation.Person;

public class Encapsulation {

    static void main() {
        Person person = new Person();
//        person.age = 12; beacuse this is private but can be access through the methods


        person.setAge(21);
        person.setName("Tushar Gupta");
        person.setSalary(800000);

        System.out.println("Name: " + person.getName()
        + "\nAge: " + person.getAge()
        + "\nSalary: " + person.getSalary());
    }
}
