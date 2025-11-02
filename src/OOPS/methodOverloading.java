package OOPS;

public class methodOverloading {
    public static void main(String[] args){
        Greet greet = new Greet();
        greet.greetings();
        greet.greetings("Tushar");
        greet.greetings("Tushar",22);
    }
}

class Greet{

    void greetings(){
        System.out.println("Hello, Good Morning!");
    }

    //method overload
    void greetings(String name){
        System.out.println("Hello " + name + ", Good Morning!");
    }

    void greetings(String name, int age){
        System.out.println("Hello "+name+", Good Morning. Your age is "+age);
    }
}
