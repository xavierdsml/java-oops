package OOPsAbstraction;

public class abstractMethods {
    public static void main(String[] args) {
        car obj = new car();
        System.out.println(obj.modelNumber("HZNWIS8974"));
        obj.numberOfWheel(4);
        obj.numberOfSeat(5);
        obj.accelerate();

    }
}




// the class which does not need to be called by instance of the class(object)
abstract class Vehicle{
    abstract void accelerate();
    abstract void numberOfWheel(int numberOfWheels);
    abstract void numberOfSeat(int numberOfSeats);
    abstract String modelNumber(String modelOfCar);
}



// for using the abstract class
class car extends Vehicle{

    @Override
    void accelerate(){
        System.out.println("The car can be accelerated upto 200Km/Hr");
    }

    @Override
    void numberOfWheel(int  numberOfWheels) {
        System.out.println("The car have only "+numberOfWheels+" wheels");
    }

    @Override
    void numberOfSeat(int numberOfSeats){
        System.out.println("The car have only " +numberOfSeats+" seats");
    }

    @Override
    String modelNumber(String modelOfCar){
        return "The module number of the car is " + modelOfCar;
    }
}