package OOPsAbstraction;

public class interfaceInJava {
    public static void main(String[] args){
        implementing obj = new implementing();
        obj.eat();
        obj.sleep();
        obj.sing();
        obj.multi();
    }
}



interface Animal{

    public void eat();
    public void sleep();
    public void sing();

    default void run(){
        System.out.println("This is a default method in the interface, not compulsory to implement in the classes");
    }

    public void multi();
}


interface inheritanceClass{
    public void multi();
}



//How to use the interface by implements in the class
class implementing implements Animal, inheritanceClass{
    @Override
    public void eat(){
        System.out.println("The Animal is going to eat somethings");
    }

    @Override
    public void sleep(){
        System.out.println("Now he is sleeping");
    }

    @Override
    public void sing(){
        System.out.println("He is in good mood, so want to sing a song");
    }

    @Override
    public void multi(){
        System.out.println("This is an example of the Multiple Inheritance interface in java ");
    }
}