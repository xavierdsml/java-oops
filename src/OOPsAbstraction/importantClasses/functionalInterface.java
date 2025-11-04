package OOPsAbstraction.importantClasses;

public class functionalInterface {
    public static void main(String[] args) {
        //Lamba Expression
        India obj = () -> {
            System.out.println("This is the state of the India");
        };
        obj.state();

        executeIndia obj1 = new executeIndia();
        obj1.state();
    }
}



@FunctionalInterface
interface India {
    void state();
}

class executeIndia implements India{
    @Override
    public void state() {
        System.out.println("This is the class of the interface to explain the body");
    }
}