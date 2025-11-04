package OOPsAbstraction.importantClasses;

public class innerClassNestedStaticClass {

    class innerClass{
        int toyPrice;
    }

    static class nestedInnerclass{
        String toyName;
    }


    public static void main(String[] args) {

        // 1. The non-static class called the Inner class, implementing using the object of subclasses.
        innerClass obj = new innerClassNestedStaticClass().new innerClass();
        obj.toyPrice = 10;

        // 2. To use the staticInner class
        nestedInnerclass obj1= new nestedInnerclass();
        obj1.toyName = "hi";


    }
}
