package OOPsEncapsulation.Encapsulation;

public class staticKeyword {

    public static int count = 10;

    public static void main(String[] args) {
        System.out.println(staticKeyword.count); // we don't need any instances of the class
        printStatic();
//        printNonStatic(); for non statics we need the object (instances of the class)

        staticKeyword obj = new staticKeyword();
        obj.printNonStatic();
    }


    public static void printStatic(){
        System.out.println("Hello, this is the static Method");
//        printNonStatic(); inside the static , non-static cannot be called

    }

    public void printNonStatic(){
        System.out.println("Hello, this is the non-static Method");
        printStatic(); // inside the non-static we can use static
    }

    public void printNonStaticMethod() {
        System.out.println("Hello, this is the non-static Method");
    }
}
