package OOPS;

public class classObject {
    static void main() {

        //object created
        Dog dog1 = new Dog();
        dog1.name = "Tommy";
        dog1.bark();
        dog1.walk();

        //object
        Dog dog2 = new Dog();
        dog2.age = 20;
        System.out.println(dog2.age);
    }
}

class Dog{
    String name;
    int age;
    String color;

    void bark(){
        System.out.println(name + " is barking to the stranger.");
    }
    void walk(){
        System.out.println(name+" is peacefully walking on the street.");
    }
}
