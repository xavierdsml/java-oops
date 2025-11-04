package OOPsAbstraction.importantClasses;

public class anonymousClass {
    public static void main(String[] args) {

        // 1. Anonymous class of the outerClass
        outerClass obj = new outerClass() {
            public void method() {
                System.out.println("This is the anonymous class of the OuterClass");
            }
        };

        // 2. Anonymous class of the interface
        anonymousExample obj1 = new anonymousExample() {
            @Override
            public void method() {
                System.out.println("This is the anonymous class of the interface");
            }
        };
    }
}



class outerClass{
    public void method(){
        System.out.println("This is outer class");
    }
}


interface anonymousExample{
    public void method();
}